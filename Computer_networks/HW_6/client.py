# Вынесены функции обработки сообщений от сервера и от пользователя в отдельные функции для лучшей читабельности и модульности.
# Добавилены параметры client_socket и nickname для этих функций, чтобы иметь возможность запустить несколько экземпляров обработчиков и подключиться к различным серверам или с различными никнеймами.
# Добавлена функция run_chat, которая реализует взаимодействие клиентской программы с сервером в отдельных потоках, позволяя пользователям одновременно отправлять и получать сообщения.
# Добавлены обработчики ошибок проверка на !exit

import socket
import threading


def handle_server_messages(client_socket, nickname):
    while True:
        try:
            message = client_socket.recv(1024).decode('utf-8')
            if message == 'NICK':
                client_socket.send(nickname.encode('utf-8'))
            elif message == "CLOSE":
                print("Connection closed by server!")
                client_socket.close()
                break
            else:
                print(message)
        except socket.error:
            print("An error occurred!")
            client_socket.close()
            break


def handle_user_input(client_socket, nickname):
    while True:
        try:
            message = input("")
            if message.lower() == "!exit":
                client_socket.send('CLOSE'.encode('utf-8'))
                client_socket.close()
                break
            else:
                message = f'{nickname}: {message}'
                client_socket.send(message.encode('utf-8'))
        except (socket.error, EOFError):
            print("An error occurred!")
            client_socket.close()
            break


def run_chat(client_socket, nickname):
    server_message_handler = threading.Thread(target=handle_server_messages, args=(client_socket, nickname))
    server_message_handler.start()

    user_message_handler = threading.Thread(target=handle_user_input, args=(client_socket, nickname))
    user_message_handler.start()


if __name__ == '__main__':
    # Choosing Nickname
    nickname = input("Choose your nickname: ")

    # Connecting To Server
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.connect(('127.0.0.1', 3333))

    run_chat(client, nickname)