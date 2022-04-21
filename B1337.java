package solution900;



import java.util.Scanner;
public class B1337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int x = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            while (x>0 && n > 0 && x/2+10 < x){
                n--;
                x=x/2+10;
            }
            if (x<=m*10) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}