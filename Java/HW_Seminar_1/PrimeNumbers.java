package HW_Seminar_1;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;
        
        System.out.println("Простые числа:");

        for ( i = 2; i < 1000; i++ ) {
            isPrime = true;
            for (j = 2; j <= i / j; j++) {
                if ((i % j) == 0)
                    isPrime = false;
            }
 
            if (isPrime)
                System.out.println(i);
        }
    }
}
