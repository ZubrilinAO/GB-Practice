/*
Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.
[345, 897, 568, 234] -> 2
*/

int[] array = GetArray(6, 100, 999);
Console.WriteLine($"Количество чётных чисел в массиве [{string.Join(", ", array)}] равно {GetCountEvenNumbers(array)}");

//--------------Методы--------------
int[] GetArray(int size, int minValue, int maxValue)
{
    int[] array = new int[size];
    for (int i = 0; i < size; i++)
    {
        array[i] = new Random().Next(minValue, maxValue + 1);
    }
    return array;
}

int GetCountEvenNumbers(int[] array)
{
    int count = 0;

    foreach (int el in array)
    {
        if (el % 2 == 0)
        {
            count++;
        }
    }
    return count;
}