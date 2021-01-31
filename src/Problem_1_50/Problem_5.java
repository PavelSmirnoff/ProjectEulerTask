package Problem_1_50;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem_5 {
    public static void main(String[] args) {
        int itog = 0;
        int z = 1;
        while (true) {
            for (int x = 1; x <= 20; x++) {
                if (z % x != 0) {
                    break;
                }
                if (x == 20) {
                    itog = z;
                    break;
                }
            }
            if (itog > 0) {
                break;
            }
            z++;
        }
        System.out.println(z);
    }
}
