package Kakao;

import java.util.Arrays;
import java.util.Comparator;

public class 튜플 {

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        String[] processing = Data_processing(s);
        Sort(processing);
        
    }

    private static String[] Data_processing(String s){
        s = s.substring(2,s.length());
        s = s.substring(0,s.length()-2).replace("},{","-");
        String[] processing = s.split("-");
        return processing;
    }

    private static void Sort(String[] processing){
        Arrays.sort(processing,new Comparator<String>(){
            public int compare(String o1, String o2){

                return Integer.compare(o1.length(), o2.length());
            }
        });
    }



}
