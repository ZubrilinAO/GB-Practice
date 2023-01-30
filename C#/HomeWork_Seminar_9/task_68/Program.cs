/*
Задача 68: Выполнить с помощью рекурсии.Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.
m = 2, n = 3 -> A(m,n) = 9
m = 3, n = 2 -> A(m,n) = 29
*/

Console.Write("Введите первое число: ");
int n = int.Parse(Console.ReadLine()!);

Console.Write("Введите второе число: ");
int m = int.Parse(Console.ReadLine()!);

Console.WriteLine(Akkerman(n, m));

// ------------------Метод------------------


int Akkerman(int n, int m)
{
    if (n == 0) return m + 1;
    if (m == 0) return Akkerman(n - 1, 1);
    return Akkerman(n - 1, Akkerman(n, m - 1));
}


