
package solution900;

import java.util.Scanner;

public class A1341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            int L = n * (a-b);
            int R = n * (a+b);
            
            if(R < c-d || L > c+d) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}