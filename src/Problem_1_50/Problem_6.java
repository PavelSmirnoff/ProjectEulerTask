package Problem_1_50;

/*
Sum square difference
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
Example :
The sum of the squares of the first ten natural numbers
sumSquares(10) = 385
The square of the sum of the first ten natural numbers
squaresSum(10) = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
3025 - 385 = 2640
 */
public class Problem_6 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println((int)Math.pow(squaresSum(num),2) - sumSquares(num));
    }

    public static int sumSquares(int num) {
        if (num == 1) {
            return (int)Math.pow(num, 2);
        } else {
            return (int)Math.pow(num, 2)+sumSquares(num-1);
        }
    }

    public static int squaresSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + squaresSum(num - 1);
        }
    }
}
