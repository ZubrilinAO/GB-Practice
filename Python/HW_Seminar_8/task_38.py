# Задача 38: Дополнить телефонный справочник возможностью изменения и удаления данных. Пользователь также может ввести имя или фамилию, и Вы должны реализовать функционал для изменения и удаления данных

import os

FILE_NAME = 'phonebook.txt'
ENCODING = 'UTF-8'


def print_file():
    try:
        index = 0
        with open(FILE_NAME, 'r+', encoding=ENCODING) as f:
            for line in f:
                index += 1
                print(f'{index}. {line.strip()}')
    except IOError:
        print("Телефонная книга не сожержит записи")


def add_contact():
    with open(FILE_NAME, 'a', encoding=ENCODING) as f:
        f.writelines(f'{create_contact_data()}\n')


def find_file(data):
    if data == None or data == False:
        return
    find_info = input(
        "Введите данные для поиска(фамилия или имя или номер): ")
    for index in range(len(data)):
        if find_info.lower() in data[index].lower():
            print(f'{index + 1}. {data[index].strip()}')


def create_contact_data():
    first_name = input("Введите имя: ").capitalize()
    last_name = input("Введите фамилию: ").capitalize()
    father_name = input("Введите отчество: ").capitalize()
    phone_number = input("Введите номер телефона: ")

    if (phone_number[0] != '+'):
        phone_number = '+' + phone_number

    contact = ' '.join([first_name,
                        last_name, father_name, phone_number])
    return contact


def get_data():
    try:
        if os.stat(FILE_NAME).st_size == 0:
            print("Телефонная книга не содержит записи")
            return
        else:
            data = list()
            with open(FILE_NAME, 'r', encoding=ENCODING) as f:
                for line in f:
                    data.append(line.strip())
            return data
    except IOError:
        print("Телефонная книга не сожержит записи")
        return


def delete_contact(data):
    if data == None or data == False:
        return
    print_file()
    contact_num = int(
        input('\nВведите цифру контакта, который хотите удалить: '))
    if check_contact_num(contact_num, data) == False:
        return
    data.pop(contact_num - 1)
    write_file(data)


def check_contact_num(contact_num, data):
    if (contact_num <= 0 or contact_num > len(data)):
        print(f'Контакта с цифрой "{contact_num}" не существует')
        return False
    return True


def change_contact(data):
    if data == None or data == False:
        return

    print_file()
    contact_num = int(
        input('\nВведите цифру контакта, который хотите изменить: '))

    if check_contact_num(contact_num, data) == False:
        return

    data[contact_num - 1] = create_contact_data()
    data.sort()
    write_file(data)


def write_file(data):
    with open(FILE_NAME,  "w", encoding=ENCODING) as f:
        for item in data:
            f.write(item + '\n')


def print_menu():
    print('\nМеню:')
    print('1. Вывод всех контактов')
    print('2. Добавить контакт')
    print('3. Поиск контакта')
    print('4. Изменить контакт')
    print('5. Удалить контакт')
    print('6. Закрыть\n')


def menu(menu_item):
    match menu_item:
        case "1":
            print_file()

        case "2":
            add_contact()

        case "3":
            find_file(get_data())

        case "4":
            change_contact(get_data())

        case "5":
            delete_contact(get_data())

        case "6":
            return 0

        case _:
            print(f'Пункта "{menu_item}" не существует')


def main():
    print_menu()
    while choice := input('>>> '):

        if menu(choice) == 0:
            break
        print_menu()


if __name__ == '__main__':
    main()
