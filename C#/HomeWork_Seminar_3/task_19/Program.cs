/* 
Задача 19
Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.
14212 -> нет
12821 -> да
23432 -> да
*/

Console.WriteLine("Введите пятизначное число: ");
int num = Convert.ToInt32(Console.ReadLine());

if (num > 9999 && num < 100000)
{
    int temp = num;
    int reverse = 0;
    int mult = 10000;

    while (temp > 0)
    {
        reverse += (temp % 10) * mult;
        mult /= 10;
        temp /= 10;
    }

    if (num == reverse)
    {
        Console.Write("да");
    }
    else
    {
        Console.Write("нет");
    }
}
else
{
    Console.Write("Некорректный ввод");
}
