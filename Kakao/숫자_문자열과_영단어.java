package Kakao;

import java.util.Dictionary;
import java.util.HashMap;

public class 숫자_문자열과_영단어 {

    private static String[] Numberic_Name = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    private static String[] Number = {"0","1","2","3","4","5","6","7","8","9"};

    public static void main(String[] args) {
        String s = "one4seveneight";
        int answer = change(s);
        System.out.println(answer);
    }
    private static int change(String s){
        for(int i=0; i<Numberic_Name.length; i++){
            if(s.contains(Numberic_Name[i])){
                s = s.replaceAll(Numberic_Name[i],Number[i]);
            }
        }
        return Integer.parseInt(s);
    }


}
