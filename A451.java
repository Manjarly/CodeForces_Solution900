
package solution900;


import java.util.Scanner;
public class A451 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        while(n > 0 && m>0){
            m--;
            n--;
            count++;
        }
        if(count%2==0) System.out.println("Malvika");
        else System.out.println("Akshat");
    }
}