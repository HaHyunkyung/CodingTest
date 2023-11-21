package Kakao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class 튜플 {

    public static void main(String[] args) {
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        String[] processing = Data_processing(s);
        Sort(processing);
        int[] answer = Tuple(processing);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
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

    private static int[] Tuple(String[] processing){
        Set<Integer> tuple = new LinkedHashSet<>();
        for (int i = 0; i < processing.length; i++) {
            String[] data = processing[i].split(",");
            for (int j = 0; j < data.length; j++) {
                tuple.add(Integer.parseInt(data[j]));
            }
        }
        int[] answer = tuple.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
