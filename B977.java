
package solution900;


import java.util.HashMap;
import java.util.Scanner;

public class B977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<n-1; i++){
            map.put(s.substring(i, i+2), 0);
        }
        for(int i = 0; i<n-1; i++){
            if(map.containsKey(s.substring(i, i+2))){
                int val = map.get(s.substring(i, i+2));
                val++;
                map.put(s.substring(i, i+2), val);
            }
        }
        int max = 0;
        for(int i = 0; i<n-1; i++){
            int val = map.get(s.substring(i, i+2));
            if(val >= max) max = val;
        }
        
        for(int i = 0; i<n-1; i++){
            int val = map.get(s.substring(i, i+2));
            if(val == max){
                System.out.println(s.substring(i, i+2));
                return;
            }
        }
    }
}