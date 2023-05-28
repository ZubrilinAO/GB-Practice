const celsius = +prompt('Введите температуру в градусах Цельсия:');
let fahrenheit = celsiusToFahrenheit(celsius);
alert(`Цельсий: ${celsius}, Фаренгейт: ${fahrenheit}`);

function celsiusToFahrenheit(celsius) {
  let fahrenheit = (9 / 5) * celsius + 32;
  fahrenheit = Math.round(fahrenheit * 10) / 10;
  return fahrenheit;
}
