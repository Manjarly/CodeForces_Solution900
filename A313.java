
package solution900;


import java.util.Scanner;
public class A313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n < 0){
            long lastDig = n/10;
            long secLast = 0;
            if(n%10==0){
                secLast = (n/100) * 10;
            }
            else{
                secLast = ((n/100)*10) + (n%10);
            }
            System.out.println(lastDig >= secLast ? lastDig : secLast);
        }
        else{
            System.out.println(n);
        }
    }
}