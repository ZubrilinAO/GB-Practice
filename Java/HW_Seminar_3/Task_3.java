package HW_Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

public class Task_3 {
    static List<String> createList(int capacity) {
        Random rand = new Random();
        List<String> planets = new ArrayList<>(
                Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Уран", "Нептун", "Плутон"));
        List<String> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            int randomIndex = rand.nextInt(planets.size());
            String randomElement = planets.get(randomIndex);
            result.add(randomElement);
        }
        return result;
    }

    public static void countPlanets(List<String> planets) {
        Set<String> uniquePlanets = new HashSet<>(planets);

        for (String planet : uniquePlanets) {
            int count = Collections.frequency(planets, planet);
            System.out.println(planet + ": " + count);
        }
    }

    public static void main(String[] args) {
        List<String> planets = createList(25);
        System.out.println(planets);
        countPlanets(planets);
    }
}
