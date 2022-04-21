package solution900;


import java.util.Scanner;
public class B1335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            char[] c = new char[n];
            for (int i = 0; i < n; ++i){
                c[i] = (char)('a' + i % b);
            }
            String result = new String(c);
            System.out.println(result);
            t--;
	}
    }
}