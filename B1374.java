package solution900;


import java.util.Scanner;
public class B1374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int count = 0;
            while(n>0){
                if(n==1) break;
                else{
                    n = n%6==0 ? n/6 : n*2;
                    count++;
                }
            }
            if(n<=0) count = -1;
            System.out.println(count);
            t--;
        }
    }
}