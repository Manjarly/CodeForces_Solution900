
package solution900;



import java.util.Arrays;
import java.util.Scanner;
public class A337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        
        for(int i = 0; i<m; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int currMin = Integer.MAX_VALUE;
        for(int i =0; i<=arr.length-n; i++){
            currMin = Math.min(currMin, (arr[i+n-1] - arr[i]));
        }
        System.out.println(currMin);
    }
}