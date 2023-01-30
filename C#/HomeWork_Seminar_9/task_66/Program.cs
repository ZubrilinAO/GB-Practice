/*
Задача 66: Выполнить с помощью рекурсии.Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.
M = 1; N = 15 -> 120
M = 4; N = 8. -> 30
*/

Console.Write("Введите первое число: ");
int M = int.Parse(Console.ReadLine()!);

Console.Write("Введите второе число: ");
int N = int.Parse(Console.ReadLine()!);

Console.WriteLine(SummInterval(M, N));

// ------------------Метод------------------
int SummInterval(int start, int end)
{
    if (start > end) return 0;
    return start + SummInterval(start + 1, end);
}

