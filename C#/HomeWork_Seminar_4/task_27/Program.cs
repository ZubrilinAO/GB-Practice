/*
Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
452 -> 11
82 -> 10
9012 -> 12
*/

System.Console.WriteLine("Введите число: ");
int num = int.Parse(Console.ReadLine()!);
System.Console.WriteLine($"Cумма цифр в числе {num} равно {GetSumNumber(num)}");

//--------------Методы--------------
int GetSumNumber(int num)
{
    int sum = 0;
    while (num > 0)
    {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}