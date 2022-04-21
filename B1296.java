
package solution900;

import java.util.Scanner;

public class B1296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long s = sc.nextLong();
            long result = 0l;
            long pw = 1000 * 1000 * 1000;
            while(s > 0){
                while(s < pw) pw /= 10;
                result += pw;
                s -= pw - pw/10;
            }
            System.out.println(result);
        }
    }
}