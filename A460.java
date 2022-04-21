package solution900;


import java.util.Scanner;
public class A460 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = n + ((n-1)/(m-1));
        System.out.println(result);
    }
}