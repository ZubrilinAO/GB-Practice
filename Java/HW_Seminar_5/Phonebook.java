package HW_Seminar_5;

import java.util.*;

public class Phonebook {
    private Map<String, List<String>> map = new HashMap<>();

    public void addContact(String name, String number) {
        if (!map.containsKey(name)) {
            map.put(name, new ArrayList<String>());
        }
        map.get(name).add(number);
    }

    public List<String> search(String name) {
        return map.getOrDefault(name, new ArrayList<String>());
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            System.out.print(name + ": ");
            for (String number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("Georgia Nelson", "7397948225385");
        phonebook.addContact("Larry Reyes", "7636883017858");
        phonebook.addContact("Alberto Hardy", "7555446526751");
        phonebook.addContact("Anne Shaw", "7400376169277");
        phonebook.addContact("Anne Shaw", "7368203640277");
        phonebook.addContact("Georgia Nelson", "76269781727220");
        phonebook.addContact("Georgia Nelson", "700332230312135");

        List<String> georgiaNumbers = phonebook.search("Georgia Nelson");
        System.out.println("Georgia Nelson: " + georgiaNumbers);
        System.out.println();

        List<String> elaineBowmanNumbers = phonebook.search("Elaine Bowman");
        System.out.println("Elaine Bowman: " + elaineBowmanNumbers);
        System.out.println();

        phonebook.printAll();
    }
}