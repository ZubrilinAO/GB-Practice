/*
Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран. (числа берете любые)
*/
int[] array = GetArray(8);
Console.WriteLine("[{0}]", string.Join(", ", array));

//--------------Методы--------------
int[] GetArray(int size)
{
    int[] array = new int[size];
    for (int i = 0; i < size; i++)
    {
        array[i] = new Random().Next(1, 101);
    }
    return array;
}