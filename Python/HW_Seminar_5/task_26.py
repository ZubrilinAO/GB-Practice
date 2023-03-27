# Задача 26:  Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.
# *Пример:*
# A = 3; B = 5 -> 243 (3⁵)
#     A = 2; B = 3 -> 8 

def power(base, exp):
    if (base == 0 and exp <= 0):
        print('Невозможно возвести 0 в степень меньше 1')
        return
    if (base == 1 or base == 0):
        return base
    if (exp > 1):
        return (base * power(base, exp - 1))
    if (exp < 1):
       return ((1 / base) * power(base, exp + 1))
    return base
        
base = int(input('Введите число: '))
exp = int(input('Введите степень числа: '))
print(f'{base} в степени {exp} равно: {power(base, exp)}')


