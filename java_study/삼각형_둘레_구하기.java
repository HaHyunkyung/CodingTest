package java_study;
import java.util.Scanner;
public class 삼각형_둘레_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three edges (length in double): ");
        double side1 = sc.nextDouble();

        double side2 = sc.nextDouble();

        double side3 = sc.nextDouble();

        if (triangle_Test(side1, side2, side3)) {
            double perimeter = triangle(side1, side2, side3);
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("Input is invalid");
        }
    }
    private static boolean triangle_Test(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    private static double triangle(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}
