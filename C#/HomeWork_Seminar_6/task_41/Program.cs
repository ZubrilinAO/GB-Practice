/*
Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел строго больше 0 ввёл пользователь.
0, 7, 8, -2, -2 -> 2
1, -7, 567, 89, 223-> 4
*/

Console.Write("Введите числа через пробел: ");
int[] numS = Array.ConvertAll(Console.ReadLine()!.Split(' ', StringSplitOptions.RemoveEmptyEntries), Convert.ToInt32); ;
Console.WriteLine($"Количество чисел больше 0: {countNumS(numS)}");

//--------------Методы--------------
int countNumS(int[] nummbers)
{
    int count = 0;
    for (int i = 0; i < nummbers.Length; i++)
    {
        if (nummbers[i] > 0) count++;
    }
    return count;
}