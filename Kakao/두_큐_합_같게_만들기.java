package Kakao;

import java.util.LinkedList;
import java.util.Queue;

public class 두_큐_합_같게_만들기 {
    public static void main(String[] args) {
        int[] queue1 = {1, 1};
        int[] queue2 = {1, 5};
        int answer = 0;
        long Target_number = target(queue1,queue2);

        if(Target_number %2 ==0){
            answer = same_queue(queue1,queue2,Target_number/2);
        }
        if(Target_number %2 !=0){
            answer = -1;
        }
        System.out.println(answer);
    }

    private static long target(int[] queue1, int[] queue2){
        long target_number = 0;
        for (int i = 0; i < queue1.length; i++) {
            target_number += (queue1[i] + queue2[i]);
        }
        return target_number;
    }

    private static int same_queue(int[] q1, int[] q2, long Target_number){
        int answer = 0;
        long q1sum = 0;
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for (int i = 0; i < q1.length; i++) {
            queue1.add(q1[i]);
            queue2.add(q2[i]);
            q1sum += q1[i];
        }
        while(q1sum != Target_number){
            if(q1sum > Target_number){
                q1sum -= queue1.peek();
                queue2.add(queue1.poll());
                answer ++;
            }
            if(q1sum < Target_number){
                q1sum += queue2.peek();
                queue1.add(queue2.poll());
                answer++;
            }
            if(answer>(queue1.size()+queue2.size())*2){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
