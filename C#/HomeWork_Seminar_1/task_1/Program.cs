/* Задача 1: Напишите программу, которая на вход принимает два числа и выдаёт,
   какое число большее, а какое меньшее.
 a = 5; b = 7 -> max = 7
 a = 2 b = 10 -> max = 10
 a = -9 b = -3 -> max = -3
*/
Console.WriteLine("Введите первое число: ");
int numA = int.Parse(Console.ReadLine());
Console.WriteLine("Введите второе число: ");
int numB = int.Parse(Console.ReadLine());

if (numA > numB) {
  Console.WriteLine($"Число {numA} больше числа {numB}.");
} else if (numA == numB) {
  Console.WriteLine($"Числa {numA} и {numB} равны.");   
} else {
  Console.WriteLine($"Число {numB} больше числа {numA}.");   
}



