package racingcar;

import java.util.*;

import camp.nextstep.edu.missionutils.Randoms;

public class PlayGame {
    private static int attempt = 0 ;
    List<String> players = new ArrayList<>();
    static Map<String, String> playerdic = new HashMap<>();

    public PlayGame(List<String> players, int attempt) {
        this.players = players;
        this.attempt = attempt;
    }

    // 플레이어 & 점수 초기화
//    public static Map<String, String> makePlayerDict(List<String> players){
//        for (String player : players) {
//            playerdic.put(player, "");
//        }
//        return playerdic;
//    }

    public static void makePlayerDict(List<String> players){
        for (String player : players) {
            playerdic.put(player, "");
        }
    }

    public static void run() {
        Set<String> keys = playerdic.keySet(); // 플레이어 이름 가져오기

        while (attempt > 0) {
            for (String key : keys) {
                int continueNum = Randoms.pickNumberInRange(0, 9);
                if (continueNum > 3) {
                    playerdic.put(key, playerdic.get(key) + "-");
                }
            }
            attempt -= 1;
        }
    }

    public static void printResult() {
        for (Map.Entry<String, String> entry : playerdic.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
