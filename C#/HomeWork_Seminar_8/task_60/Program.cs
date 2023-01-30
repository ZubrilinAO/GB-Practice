/*
Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. Напишите программу, которая будет построчно выводить массив, добавляя индексы каждого элемента.
Массив размером 2 x 2 x 2
66(0,0,0) 25(0,1,0)
34(1,0,0) 41(1,1,0)
27(0,0,1) 90(0,1,1)
26(1,0,1) 55(1,1,1)
*/

Console.Write("Введите глубину: ");
int deph = int.Parse(Console.ReadLine()!);

Console.Write("Введите количество строк: ");
int rows = int.Parse(Console.ReadLine()!);

Console.Write("Введите количество столбцов: ");
int columns = int.Parse(Console.ReadLine()!);

int amountElements = rows * columns * deph;

if (amountElements > 90)
{
    Console.Write("Превышено кол-во элементов!(двузначных чисел 90)");
}
else
{
    int[,,] array = GetArray(deph, rows, columns, 10, 99);
    PrintArray(array);
}


// -------------------Методы---------------------------------
int[,,] GetArray(int deph, int rows, int columns, int minValue, int maxValue)
{
    int[,,] result = new int[deph, rows, columns];
    int tmp = 0;
    for (int i = 0; i < deph; i++)
    {
        for (int j = 0; j < rows; j++)
        {
            int k = 0;
            while (k < columns)
            {
                tmp = new Random().Next(minValue, maxValue + 1);
                if (CheckArray(result, tmp))
                {
                    result[i, j, k] = tmp;
                    k++;
                }
            }
        }
    }
    return result;
}

void PrintArray(int[,,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            for (int k = 0; k < array.GetLength(2); k++)
            {
                Console.Write($"{array[i, j, k]}({j},{k},{i}) ");
            }
            Console.WriteLine();
        }
        Console.WriteLine();
    }
}

bool CheckArray(int[,,] array, int value)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            for (int k = 0; k < array.GetLength(2); k++)
            {
                if (array[i, j, k] == value) return false;
            }
        }
    }
    return true;
}

