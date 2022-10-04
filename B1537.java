package solution900;


import java.util.Arrays;
import java.util.Scanner;
public class B1537 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        	int n = sc.nextInt();
        	int[] arr = new int[n];
        	for(int i = 0; i < n; i++) {
        		arr[i] = sc.nextInt();
        	}
        	
        	int nosimilar = 0;
        	int first = arr[0];
        	for(int i = 1; i < n; i++) {
        		if(arr[i] == first) {
        			nosimilar++;
        		}
        	}
        	if(nosimilar + 1 == n) System.out.println(-1);
        	else {
        		int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
        		for(int i = 0; i < n; i++) {
        			if(arr[i] == max) {
        				if(i != 0 && i != n - 1) {
        					if(arr[i] > arr[i+1] || arr[i] > arr[i-1]) {
        						System.out.println(i + 1);
        						break;
        					}
        				}
        				else if(i == 0 && arr[i] > arr[i+1]) {
        					System.out.println(i + 1);
        					break;
        				}
        				else if(i == n -1 && arr[i] > arr[i-1]) {
        					System.out.println(i + 1);
        					break;
        				}
        			}
        		}
        	}
        }
    }
}