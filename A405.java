
package solution900;


import java.util.Arrays;
import java.util.Scanner;
public class A405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}