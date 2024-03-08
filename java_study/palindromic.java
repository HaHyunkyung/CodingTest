package java_study;
import java.util.Scanner;
public class palindromic {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("input number: ");
            int inputnum = scanner.nextInt();

            if (isPalindrome(inputnum)) {
                System.out.println(inputnum + " is palindrome");
            } else {
                System.out.println(inputnum + " is not palindrome");
            }
        }

        public static int reverse(int number) {
            int reverse = 0;
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }
            return reverse;
        }
        public static boolean isPalindrome(int number) {
            return number == reverse(number);
        }

}
