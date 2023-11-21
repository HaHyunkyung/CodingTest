package Kakao;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        pc_moves(moves);
        int answer = crain(board,moves);
        System.out.println(answer);
    }
    private static void pc_moves(int[] moves){
        for (int i = 0; i < moves.length; i++) {
            moves[i]=moves[i]-1;
        }
    }
    private static int crain(int[][] board, int[] moves){
        Stack<Integer> basket = new Stack<>();
        basket.push(0);
        int doll = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j=0; j<board.length; j++){
                if(board[j][moves[i]] != 0){
                        if (basket.peek() == board[j][moves[i]]) {
                            basket.pop();
                            doll += 2;
                        }
                        else{
                            basket.push(board[j][moves[i]]);
                        }
                    board[j][moves[i]] = 0;
                        break;
                }
            }
        }
        return doll;
    }
}
