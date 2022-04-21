package solution900;


import java.util.Scanner;
public class B1607 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long result = solve(a, b);
            System.out.println(result);
        }
    }

    public static long solve(long x, long n) {
        long y = n % 4;
        long z = 0;
        if(y == 0) return x;
        if (y == 1) z = -n;
        else if (y == 2) z = 1;
        else if (y == 3) z = n + 1;
        
        if(x%2==0) return x+z;
        else return x-z;
        
    }
}
