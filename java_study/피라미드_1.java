package java_study;
import java.util.Scanner;
public class 피라미드_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        pyramid(n);
    }
    private static void pyramid(int n) {
       int base = (n -1) * 2;
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 0; j < base; j++) {
                System.out.print(" ");
            }
            if(n >=10 && i < 10){
                for (int a = 1; a <= n-9; a++) {
                    System.out.print(" ");
                }
            } else if (i > 9 && i < n){
                for (int b = 1; b <= n - i; b++) {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print(num);
                System.out.print(" ");
                if(k<i)
                    num--;
                else
                    num++;
            }

            System.out.println();
            base = base - 2;
        }
    }
}
