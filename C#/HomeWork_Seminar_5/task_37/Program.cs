/*
Задача 37: Найдите произведение пар чисел в одномерном массиве. Парой считаем первый и последний элемент, второй и предпоследний и т.д. Результат запишите в новом массиве.

[1 2 3 4 5] -> 5 8 3
[6 7 3 6] -> 36 21
*/

int[] array = GetArray(5, 1, 10);
int[] resArray = GetMult(array);
Console.WriteLine($"[{string.Join(", ", array)}]");
Console.WriteLine($"Произведение пар чисел в одномерном массиве равно [{string.Join(", ", resArray)}]");

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

int[] GetMult(int[] array)
{
    int[] res;
    int lenght = 0;

    if (array.Length % 2 == 0)
    {
        lenght = array.Length / 2;
        res = new int[lenght];
    }
    else
    {
        lenght = array.Length / 2 + 1;
        res = new int[lenght];
    }

    for (int i = 0; i < lenght; i++)
    {
        if (array[i] == array[array.Length - i - 1])
        {
            res[i] = array[i];
        }
        else
        {
            res[i] = array[i] * array[array.Length - i - 1];
        }
    }
    return res;
}
