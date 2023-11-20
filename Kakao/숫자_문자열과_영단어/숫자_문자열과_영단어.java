package Kakao.숫자_문자열과_영단어;

import java.util.Dictionary;
import java.util.HashMap;

public class 숫자_문자열과_영단어 {

    private static String[] Numberic_Name = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    private static int[] Number = {0,1,2,3,4,5,6,7,8,9};
    private static String s = "one4seveneight";
    public static void main(String[] args) {
        Hash();
        change(s);
    }
    private static void Hash(){

    }

    private static void change(String s){
        for(int i=0; i<Numberic_Name.length; i++){
            if(s.contains(Numberic_Name[i])==true){

            }
        }
    }


}
