
package solution900;


import java.util.Scanner;
public class A96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.nextLine();
        String zero = "0000000";
        String one = "1111111";
        if(s.length() < 7){
            System.out.println("NO");
            return;
        }
        else{
            for(int i = 0; i<s.length()-6; i++){
                if(s.substring(i,i+7).equals(zero) || s.substring(i,i+7).equals(one)){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}