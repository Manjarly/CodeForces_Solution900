package solution900;


import java.util.Scanner;
public class A1343 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t>0){
            long n = sc.nextLong();
            long result = n;
            long count = 1;
            long index = 1;
            while(result != 0){
                count += Math.pow(2, index);
                if(n%count == 0){
                    result = n / count;
                    break;
                }
                else{
                    index++;
                }
            }
            System.out.println(result);
            t--;
        }
    }
}
