package Seminar_2;

import java.io.*;

public class SomeClass {
    public static void main(String[] args) {
        try {
            String[] strings = { "asdf", "asdf" };
            String strings1 = strings[2];
            int a = 1 / 0;
            test();
            InputStream inputStream = new FileInputStream("sdafgdsaf");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я всеравно выполнился!");
        }
        System.out.println("Я жив");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            reader.read();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
