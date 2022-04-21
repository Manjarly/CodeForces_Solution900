
package solution900;


import java.util.Scanner;
public class A580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int currMax = 0;
        for(int i = 0; i<n-1; i++){
            if(arr[i] <= arr[i+1]){
                count++;
                currMax = Math.max(currMax, count);
            }
            else count = 0;
        }
        System.out.println(currMax+1);
    }
}