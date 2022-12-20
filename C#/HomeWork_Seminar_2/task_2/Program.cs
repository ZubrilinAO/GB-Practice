/* 
Задача 2: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет. Берем числа до 100000

645 -> 5
78 -> третьей цифры нет
32679 -> 6
*/

Console.WriteLine("Введите число: ");
int num = Math.Abs(int.Parse(Console.ReadLine()));

if (num < 100000)
{
    if (num < 100) { Console.Write("третьей цифры нет"); }
    else
    {
        while (num > 999)
        {
            num /= 10;
        }

        num = num % 10;
        Console.Write(num);
    };
}
else
{
    Console.Write("Некорректный ввод");
}


