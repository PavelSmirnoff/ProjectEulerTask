package Problem_1_50;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem_1 {
    public static void main(String[] args) {

        int x = 1000;

        int y = 0;
        for (int z = 0; z < x;z++) {
            if (z%3==0||z%5==0) {
                y+=z;
            }
        }

        System.out.println(y);
    }
}
