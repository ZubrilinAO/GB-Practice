/*
Задача 64: Выполнить с помощью рекурсии.Задайте значение N. Напишите программу,
которая выведет все натуральные числа в промежутке от N до 1.
N = 5-> "5, 4, 3, 2, 1"
N = 8-> "8, 7, 6, 5, 4, 3, 2, 1"
*/

Console.Write("Введи число: ");
int N = int.Parse(Console.ReadLine()!);

Console.WriteLine(PrintNumbers(N));

// ------------------Метод------------------
string PrintNumbers(int start)
{
    if (start == 1) return start.ToString();
    return (start + " " + PrintNumbers(start - 1));
}