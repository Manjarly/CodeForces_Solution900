package solution900;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class B1535 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        	int n = sc.nextInt();
        	int[] arr = new int[n];
        	for(int i = 0; i < n; i++) {
        		arr[i] = sc.nextInt();
        	}
        	int count = 0;
        	int even = 0, odd = 0;
        	for(int i = 0; i < n; i++) {
        		if(arr[i] % 2 == 0) even++;
        		else odd++;
        	}
        	// divide the array in two parts of even and odd
        	// if i and j both are taken from even then add the total nunmber of even numbers
        	// if i is from even part and j is from odd part then add even * odd in count
        	// if i and j both are taken from odd, find GCD using brute force
        	count += (even * (even - 1)) / 2;
        	count += even * odd;
        	
        	for(int i = 0; i < n-1; i++) {
        		for(int j = i + 1; j < n; j++) {
        			if(arr[i] % 2 != 0 && arr[j] % 2 != 0) {
        				if(findGCD(arr[i], 2*arr[j]) > 1) count++;
        			}
        		}
        	}
        	System.out.println(count);
        }
        sc.close();
    }
    public static int findGCD(int a, int b) {
    	int gcd = 0, temp;
    	
    	while(b != 0)  {  
    		temp = b;  
    		b = a % b;  
    		a = temp;
    	}
    	gcd = a;
    	
    	return gcd;
    }
}