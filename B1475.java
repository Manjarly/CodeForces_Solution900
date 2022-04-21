package solution900;


import java.util.Scanner;
public class B1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int count2021 = n % 2020;
            int count2020 = ((n-count2021)/2020) - count2021;
            if(count2020>=0 && 2020*count2020 + 2021*count2021 == n){
                System.out.println("YES");
            }
            else System.out.println("NO");
            t--;
        }
    }
}