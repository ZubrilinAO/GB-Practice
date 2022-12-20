﻿/* 
Задача 1: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа. Обязательна проверка на ввод чисел больше/меньше 3-х знаков

456 -> 5
782 -> 8
918 -> 1
*/

Console.WriteLine("Введите трёхзначное число: ");
int num = Math.Abs(int.Parse(Console.ReadLine()));

if (num >= 100 && num < 1000)
{
    num = ((num % 100) - (num % 10)) / 10;
    Console.Write(num);
}
else
{
    Console.Write("Некорректный ввод");
}

