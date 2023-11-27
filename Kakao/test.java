package Kakao;

import java.util.HashMap;
import java.util.Collections;
public class test {

    private static HashMap<String, Integer> gift_score = new HashMap<>();
    private static HashMap<String, Integer> who_max = new HashMap<>();

    public static void main(String[] args) {

        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan",
                "neo muzi"};
        reset(friends);
        present_score(gifts);
        who_max_present(friends, gifts);
        int answer = Collections.max(who_max.values());
        System.out.println(answer);
    }

    //해쉬맵 초기화
    private static void reset(String[] friends) {
        for (int i = 0; i < friends.length; i++) {
            gift_score.put(friends[i], 0);
            who_max.put(friends[i], 0);
        }
    }

    //선물 지수
    private static void present_score(String[] gifts) {

        for (int i = 0; i < gifts.length; i++) {
            String give_name = gifts[i].split(" ")[0];
            int give_score = gift_score.get(give_name) + 1;
            gift_score.put(give_name, give_score);

            String take_name = gifts[i].split(" ")[1];
            int take_score = gift_score.get(take_name) - 1;
            gift_score.put(take_name, take_score);
        }
    }

    private static void who_max_present(String[] friends, String[] gifts) {
        for (int i = 0; i < friends.length - 1; i++) {
            String relation_left = friends[i];
            for (int k = i + 1; k < friends.length; k++) {
                String relation_right = friends[k];
                int give_score = 0;
                int take_score = 0;
                for (int j = 0; j < gifts.length; j++) {
                    if (relation_left.equals(gifts[j].split(" ")[0])) {
                        if (relation_right.equals(gifts[j].split(" ")[1])) {
                            give_score += 1;
                        }
                    }

                    if (relation_right.equals(gifts[j].split(" ")[0])) {
                        if (relation_left.equals(gifts[j].split(" ")[1])) {
                            take_score += 1;
                        }
                    }
                }

                if (give_score > take_score) {
                    int next_month_present = who_max.get(relation_left) + 1;
                    who_max.put(relation_left, next_month_present);
                }

                if (give_score < take_score) {
                    int next_month_present = who_max.get(relation_right) + 1;
                    who_max.put(relation_right, next_month_present);
                }

                if (give_score == take_score) {
                    if (gift_score.get(relation_left) > gift_score.get(relation_right)) {
                        int next_month_present = who_max.get(relation_left) + 1;
                        who_max.put(relation_left, next_month_present);
                    }

                    if (gift_score.get(relation_left) < gift_score.get(relation_right)) {
                        int next_month_present = who_max.get(relation_right) + 1;
                        who_max.put(relation_right, next_month_present);
                    }
                }
            }
        }
    }
}
