
package solution900;


import java.util.Arrays;
import java.util.Scanner;
public class A160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int result = 0;
        int count = 0;
        for(int i = n-1; i>=0; i--){
            sum -= arr[i];
            result += arr[i];
            count++;
            if(result > sum){
                System.out.println(count);
                return;
            }
        }
    }
}