package solution900;


import java.util.Arrays;
import java.util.Scanner;
public class B34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        int index = 0;
        while(index < m && arr[index] <=0){
            count += arr[index];
            index++;
        }
        System.out.println(Math.abs(count));
    }
}