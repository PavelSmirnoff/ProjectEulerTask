package Problem_1_50;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */
public class Problem_7 {
    public static void main(String[] args) {
        // a prime factor is something that can divide by only 1 and itself evenly
        int counter = 0;
        int primeNum = 0;

        for (int num = 2; num < 10000000; num++) {
            boolean isPrime = true;
            for (int factor = 2; factor < num; factor++) {
                if (num % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNum = num;
                counter++;
            }
            if (counter == 10001) {
                break;
            }
        }
        System.out.println(primeNum);
    }
}
