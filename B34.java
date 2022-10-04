package solution900;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class B34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        	int x = sc.nextInt();
        	List<Integer> list = new ArrayList<>();
        	int sum = 0, last = 9;
        	while(sum < x && last > 0) {
        		list.add(Math.min(x-sum, last));
        		sum += last;
        		last--;
        	}
        	
        	if(sum < x) System.out.println(-1);
        	else {
        		Collections.reverse(list);
        		for(int i : list) {
        			System.out.print(i);
        		}
        	}
        	System.out.println();
        }
    }
}