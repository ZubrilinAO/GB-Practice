# Задача 16: Требуется вычислить, сколько раз встречается некоторое число X в массиве A[1..N]. Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X
#     1 2 3 4 5
#     3
#     -> 1

n = int(input('Введите количество элементов в массиве: '))
numbers_list = [int(input(f'Ввести {i} элемент: ')) for i in range(n)]
print(*numbers_list)

count = 0
num = int(input('Введите число: '))

for i in numbers_list:
    if i == num:
        count+=1

print(f'Количество, которое число {num} встречается в массиве равно: {count}')