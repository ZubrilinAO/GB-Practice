package HW_Seminar_5;

import java.util.*;

public class EmployeeCounter {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов");

        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : employees) {
            String firstName = name.split(" ")[0];
            nameCounts.put(firstName, nameCounts.getOrDefault(firstName, 0) + 1);
        }

        Map<Integer, List<String>> nameCount = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (!nameCount.containsKey(count)) {
                nameCount.put(count, new ArrayList<>(Arrays.asList(name)));
            } else {
                nameCount.get(count).add(name);
            }
        }

        for (Map.Entry<Integer, List<String>> entry : nameCount.entrySet()) {
            int count = entry.getKey();
            List<String> names = entry.getValue();
            Collections.sort(names);
            for (String name : names) {
                System.out.println(count + ": " + name);
            }
        }
    }
}
