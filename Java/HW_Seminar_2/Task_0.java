package HW_Seminar_2;

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

public class Task_0 {
    public static void findJewelsInStones(String jewels, String stones) {
        String result = "";
        for (int i = 0; i < jewels.length(); i++) {
            char current = jewels.charAt(i);
            int count = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == current) {
                    count++;
                }
            }
            if (count > 0) {
                result += current + Integer.toString(count);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";

        findJewelsInStones(jewels, stones);
    }
}
