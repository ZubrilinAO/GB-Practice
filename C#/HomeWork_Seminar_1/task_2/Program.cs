/* 
Задача 2: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.
2, 3, 7 -> 7
44 5 78 -> 78
22 3 9 -> 22
*/

Console.WriteLine("Введите первое число: ");
int numA = int.Parse(Console.ReadLine());
Console.WriteLine("Введите второе число: ");
int numB = int.Parse(Console.ReadLine());
Console.WriteLine("Введите третье число: ");
int numC = int.Parse(Console.ReadLine());
int max = numA;

if (max < numB) max = numB;
if (max < numC) max = numC;

Console.WriteLine($"Максимальное число: {max}");

