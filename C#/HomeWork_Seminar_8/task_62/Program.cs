/*
Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
Например, на выходе получается вот такой массив:
01 02 03 04
12 13 14 05
11 16 15 06
10 09 08 07
*/

Console.Write("Введите размер матрицы: ");
int size = int.Parse(Console.ReadLine()!);
PrintArray(GetArray(size));

string[,] GetArray(int size)
{
    string[,] result = new string[size, size];
    int count = 1;
    int col = size;
    int max = 0;

    while (Math.Round((double)col / 2) > 0)
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if (i == 0 && j < col - max)
                {
                    result[i + max, j + max] = ConvertIntToString(count);
                    count++;
                }
                if (j != 0)
                {
                    if (i == 2 && j < col - max)
                    {
                        result[col - 1, col - (j + 1)] = ConvertIntToString(count);
                        count++;
                    }
                    if (i == 1 && j < col - max)
                    {
                        result[j + max, col - 1] = ConvertIntToString(count);
                        count++;
                    }
                    if (i == 3 && j < col - (max + 1))
                    {
                        result[col - (j + 1), max] = count.ToString("D2");
                        count++;
                    }
                }
            }
        }

        col--;
        max++;
    }
    return result;
}

string ConvertIntToString(int value)
{
    return value.ToString("D2");
}


void PrintArray(string[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
}