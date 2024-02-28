package Kakao;

public class 거리두기_확인하기 {
    public static void main(String[] args) {
        int[] answer = {};
        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        Distancing_Check(places);
    }

    private static void Distancing_Check(String[][] places){
        boolean distancing = true;
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                //일단 바로 옆줄 확인
                distancing = check_next(places[i][j]);
            }
        }
    }

    private static boolean check_next(String places){
        boolean distancing = true;
        String[] sheet = places.split("");
        for (int i = 0; i < sheet.length -1; i++) {
            if(sheet[i].equals("P")) {
                for (int j = i + 1; j < sheet.length; j++) {
                    
                }
            }
        }
        return distancing;
    }
}
