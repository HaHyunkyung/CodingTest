package Kakao;

public class 키패드_누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(push(numbers,hand));

    }

    private static String push(int[] numbers, String hand){
        String answer = "";
        int left = 10;
        int right = 12;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                answer += "L";
                left = numbers[i];
            }
            if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                answer += "R";
                right = numbers[i];
            }
            if(numbers[i]==2||numbers[i]==5||numbers[i]==8||numbers[i]==0){
                int pad = numbers[i];
                if(numbers[i]==0){
                    pad = 11;
                }
                String where = check_hand(left,right,pad,hand);
                if(where == "L"){
                    left = pad;
                }
                if(where == "R"){
                    right = pad;
                }
                answer += where;

            }
        }
        return answer;
    }

    private static String check_hand(int left, int right, int numbers,String hand){

        int leftlength = Math.abs(numbers-left)/3 + Math.abs(numbers-left)%3;
        int rightlength = Math.abs(numbers-right)/3 + Math.abs(numbers-right)%3;
        String answer = "";

        if(leftlength < rightlength){
            answer = "L";
        }
        if(leftlength > rightlength){
            answer = "R";
        }
        if(leftlength == rightlength){
            if(hand.equals("right")){
                answer = "R";
            }
            if(hand.equals("Left")){
                answer = "L";
            }
        }
        return answer;
    }

}
