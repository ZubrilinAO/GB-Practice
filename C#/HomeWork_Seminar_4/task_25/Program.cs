/*
Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B. (Задачи, решенные через Math.Pow, будут отправлены на переделку, так как задача стоит в том, чтобы написать цикл)
3, 5-> 243(3⁵)
2, 4-> 16
*/
System.Console.WriteLine("Введите основание степени: ");
int basis = int.Parse(Console.ReadLine()!);
System.Console.WriteLine("Введите показатель степени: ");
int exp = int.Parse(Console.ReadLine()!);
System.Console.WriteLine($"Число {basis} в степени {exp} равно {GetPow(basis, exp)}");

//--------------Методы--------------
int GetPow(int basis, int exp)
{
    int pow = 1;
    for (int i = 1; i <= exp; i++)
    {
        pow *= basis;
    }
    return pow;
}