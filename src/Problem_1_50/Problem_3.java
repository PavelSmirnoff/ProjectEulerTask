package Problem_1_50;

/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */
public class Problem_3 {
    public static void main(String[] args) {
        long z=600851475143L, z1=1;
        for (long x=2;x<z;x++ ){
            if(z%x==0){
                z1*=x;
                if (z1==z){
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}
