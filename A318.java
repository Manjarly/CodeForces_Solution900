
package solution900;


import java.util.Scanner;
public class A318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n%2==0){
            if(k <= n/2){
                System.out.println(((k-1) * 2) + 1);
            }
            else{
                k = k - n/2;
                System.out.println(2*k);
            }
        }
        else if(n%2!=0){
            if(k <= n/2 + 1){
                System.out.println(((k-1) * 2) + 1);
            }
            else{
                k = k - n/2;
                System.out.println(2*k - 2);
            }
        }
        
    }
}