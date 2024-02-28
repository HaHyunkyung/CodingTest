package java_study;
import java.util.Scanner;

public class 각_자리_곱하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an interger between 0 and 1000: ");

        int num = scanner.nextInt();

        int result = mul_digit(num);
        System.out.println("The Multiplecation of all digits in "+num+" is "+result);
    }
    private static int mul_digit(int num) {
        int answer = 1;

        while (num != 0) {
            int digit = num % 10;
            answer *= digit;
            num /= 10;
        }
        return answer;
    }
}
