package HW_Seminar_2;

// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

public class Task_1 {
    public static String shuffle(String s, int[] indexes) {
        char[] charArray = s.toCharArray();
        char[] result = new char[s.length()];
        for (int i = 0; i < indexes.length; i++) {
            result[indexes[i]] = charArray[i];
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String s = "cba";
        int[] indexes = { 2, 1, 0 };
        String result = shuffle(s, indexes);
        System.out.println(result);
    }
}
