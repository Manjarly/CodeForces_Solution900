package solution900;



import java.util.Scanner;
public class B1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int count0 = 0;
            int count1 = 0;
            char[] ch = sc.next().toCharArray();
            for(int i = 0; i<ch.length; i++){
                if(ch[i] == '1') count1++;
                else count0++;
            }
            if(Math.min(count0, count1) % 2 == 0) System.out.println("NET");
            else System.out.println("DA");
            t--;
        }
    }
}