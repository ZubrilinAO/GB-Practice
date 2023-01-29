/*
Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
Например, даны 2 матрицы:
2 4 | 3 4
3 2 | 3 3
Результирующая матрица будет:
18 20
15 18
*/

Console.Write("Введите количество строк для 1-й матрицы: ");
int rowsMatrixA = int.Parse(Console.ReadLine()!);

Console.Write("Введите количество столбцов для 1-й матрицы: ");
int columnsMatrixA = int.Parse(Console.ReadLine()!);

Console.Write("Введите количество строк для 2-й матрицы: ");
int rowsMatrixB = int.Parse(Console.ReadLine()!);

Console.Write("Введите количество столбцов для 2-й матрицы: ");
int columnsMatrixB = int.Parse(Console.ReadLine()!);

int[,] matrixA = GetArray(rowsMatrixA, columnsMatrixA, 0, 10);
int[,] matrixB = GetArray(rowsMatrixB, columnsMatrixB, 0, 10);

Console.WriteLine("Первая матрица: ");
PrintArray(matrixA);
Console.WriteLine("Вторая матрица: ");
PrintArray(matrixB);

if (CheckMultMatrix(matrixA, matrixB))
{
    Console.WriteLine("Произведение матриц: ");
    PrintArray(MatrixЬultiplication(matrixA, matrixB));
}
else Console.WriteLine("Количество столбцов первой матрицы не равно количеству строк второй матрицы.");


// -------------------Методы---------------------------------
int[,] GetArray(int m, int n, int minValue, int maxValue)
{
    int[,] result = new int[m, n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            result[i, j] = new Random().Next(minValue, maxValue + 1);
        }
    }
    return result;
}

void PrintArray(int[,] array)
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

int[,] MatrixЬultiplication(int[,] matrixA, int[,] matrixB)
{
    int[,] result = new int[matrixA.GetLength(0), matrixB.GetLength(1)];

    for (int i = 0; i < matrixA.GetLength(0); i++)
    {
        for (int j = 0; j < matrixB.GetLength(1); j++)
        {
            for (int k = 0; k < matrixA.GetLength(1); k++)
            {
                result[i, j] += matrixA[i, k] * matrixB[k, j];
            }
        }
    }
    return result;
}

bool CheckMultMatrix(int[,] matrixA, int[,] matrixB)
{
    return matrixA.GetLength(1) == matrixB.GetLength(0);
}