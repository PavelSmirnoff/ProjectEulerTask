package Problem_1_50;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
public class Problem_10 {
    public static void main(String[] args) {

        long primeNum = 0;

        for (long num = 2; num < 2_000_000L; num++) {
            boolean isPrime = true;
            for (long factor = 2; factor < num; factor++) {
                if (num % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNum += num;
                System.out.println(num);
            }
        }
        System.out.println(primeNum);
    }
}
