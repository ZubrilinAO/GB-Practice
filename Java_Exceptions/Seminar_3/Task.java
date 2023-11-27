package Seminar_3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в следующем порядке: Фамилия Имя Отчество Дата рождения Номер телефона Пол");
        String input = scanner.nextLine();
        scanner.close();

        String[] data = input.split(" ");
        if (data.length != 6) {
            System.out.println("Ошибка: введено неправильное количество данных");
            return;
        }

        String surname = data[0];
        String firstName = data[1];
        String patronymic = data[2];
        String birthdateStr = data[3];
        String phoneNumberStr = data[4];
        String genderStr = data[5];

        try {

            validateName(surname);
            validateName(firstName);
            validateName(patronymic);

            LocalDate birthdate = parseBirthdate(birthdateStr);
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            String formattedBirthdate = birthdate.format(outputFormatter);

            long phoneNumber = parsePhoneNumber(phoneNumberStr);
            char gender = parseGender(genderStr);

            String filename = surname + ".txt";
            String line = "<" + surname + ">" + "<" + firstName + ">" + "<" + patronymic + ">" + "<"
                    + formattedBirthdate
                    + ">" + "<" + phoneNumber + ">" + "<" + gender + ">";

            writeDataToFile(filename, line);

            System.out.println("Данные успешно записаны в файл " + filename);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void validateName(String name) {
        if (!name.matches("[A-Za-zА-Яа-я]+")) {
            throw new IllegalArgumentException("Ошибка: некорректное значение имени, фамилии или отчества");
        }
    }

    private static LocalDate parseBirthdate(String birthdateStr) {
        try {
            return LocalDate.parse(birthdateStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            throw new IllegalArgumentException("Ошибка при разборе даты рождения", e);
        }
    }

    private static long parsePhoneNumber(String phoneNumberStr) {
        try {
            return Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка при разборе номера телефона", e);
        }
    }

    private static char parseGender(String genderStr) {
        if (genderStr.length() != 1) {
            throw new IllegalArgumentException("Ошибка: некорректное значение пола");
        }
        char gender = genderStr.charAt(0);
        if (gender != 'f' && gender != 'm') {
            throw new IllegalArgumentException("Ошибка: некорректное значение пола");
        }
        return gender;
    }

    private static void writeDataToFile(String filename, String line) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(line + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи данных в файл", e);
        }
    }
}
