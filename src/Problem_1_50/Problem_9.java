package Problem_1_50;
/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
public class Problem_9 {
    public static void main(String[] args) {
        int i = 1000;
        for(int a=0;a<i;a++){
            for(int b=0;b<i;b++){
                for(int c=0;c<i;c++){
                    if ((Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))&&(a+b+c==i)&&(a<b)&&(b<c)){
                        System.out.printf("a=%d; b=%d; c=%d;%n, Result problem=%d%n",a,b,c,a*b*c);
                    }
                }
            }
        }
    }
}
