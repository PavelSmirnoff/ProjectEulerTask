package Problem_1_50;

/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem_4 {
    public static void main(String[] args) {
        int x = 999;
        int y = 999;
        while(true){
            String str = String.valueOf(x*y--);
            StringBuilder strB = new StringBuilder(str);
            //System.out.println(strB);
            if(strB.toString().equals(strB.reverse().toString())){
                System.out.println(x);
                System.out.println(y);
                System.out.println(strB.toString());
                break;
            }
            if(y<=900){
                y = 999;
                x--;
            }
        }
    }
}
/*
String.valueOf(number)
Integer.toString(number)
 */