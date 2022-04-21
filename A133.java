
package solution900;



import java.util.ArrayList;
import java.util.Scanner;
public class A133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        if(list.contains('H') || list.contains('Q') || list.contains('9')){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}