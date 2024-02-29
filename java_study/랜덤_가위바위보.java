package java_study;
import java.util.Random;
import java.util.Scanner;
public class 랜덤_가위바위보 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userWins = 0;
        int computerWins = 0;

        while (userWins < 2 && computerWins < 2) {

            int computerChoice = random.nextInt(3);

            System.out.println("computer is " + computerChoice);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int userChoice = scanner.nextInt();

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                    (userChoice == 1 && computerChoice == 0) ||
                    (userChoice == 2 && computerChoice == 1)) {
                System.out.println("you won");
                userWins++;
            } else {
                System.out.println("computer won");
                computerWins++;
            }
        }

        // 게임 종료 메시지 출력
        if (userWins >= 2) {
            System.out.println("you won more than two times");
        }

    }
}
