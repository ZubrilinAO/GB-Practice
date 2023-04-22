package HW_Seminar_2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Task_3 {

    public static void printBook(String[] cookbook) {
        for (String str : cookbook) {
            System.out.println(str);
        }
    }

    public static void replaceBook(String[] cookbook, Map<String, String> replacements) {
        for (int i = 0; i < cookbook.length; i++) {
            String[] words = cookbook[i].split("\\s+");
            for (int j = 0; j < words.length; j++) {
                String word = words[j].toLowerCase();
                if (replacements.containsKey(word)) {
                    String replace = replacements.get(word);
                    if (Character.isUpperCase(words[j].charAt(0))) {
                        words[j] = replace.substring(0, 1).toUpperCase()
                                + replace.substring(1);
                    } else {
                        words[j] = replace;
                    }
                }
            }
            cookbook[i] = String.join(" ", words);
        }
        printBook(cookbook);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of lines in a book: ");
        int n = input.nextInt();
        input.nextLine();

        String[] cookbook = new String[n];
        for (int i = 0; i < n; i++) {
            cookbook[i] = input.nextLine();
        }

        System.out.print("Enter number of foods: ");
        int m = input.nextInt();
        input.nextLine();

        Map<String, String> replacements = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] sub = input.nextLine().split(" - ");
            replacements.put(sub[0], sub[1]);
        }

        replaceBook(cookbook, replacements);
        input.close();
    }
}
