package java_study;

public class emirp {
    public static void main(String[] args) {
        final int numEmirpsToFind = 120;
        int count = 0;
        int number = 2;

        while (count < numEmirpsToFind) {
            if (isEmirp(number)) {
                System.out.print(number+" ");
                count++;
                if (count % 10 ==0){
                    System.out.println();
                }
            }
            number++;
        }
    }
    public static boolean isEmirp(int number) {
        palindromic pal = new palindromic();

        if (isPrime(number) && isPrime(pal.reverse(number))) {
            return !pal.isPalindrome(number);
        }
        return false;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}


