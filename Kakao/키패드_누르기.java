package Kakao;

public class 키패드_누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String answer = push(numbers,hand);

    }

    private static String push(int[] numbers, String hand){
        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                answer += "L";
            }
            if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                answer += "R";
            }
            if(numbers[i]==2||numbers[i]==5||numbers[i]==8||numbers[i]==0){

            }
        }

    }
}
