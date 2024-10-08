package racingcar;

import java.util.*;

public class PrintWinner {
    static Map<String, String> playerdic = new HashMap<>();
    static HashMap<String, Integer> winnerMap = new HashMap<String, Integer>();
    static List<String> winnerList = new ArrayList<>();

    public PrintWinner(Map<String, String> playerdic) {
        this.playerdic = playerdic;
    }

    public static Map<String, Integer> distanceMove () {
        for (Map.Entry<String,String> entry : playerdic.entrySet()) {
            int count = countDashes(entry.getValue());
            winnerMap.put(entry.getKey(), count);
        }
        return winnerMap;
    }

    private static int countDashes(String str) {
        int count = 0;
        for (int i=0 ; i<str.length() ; i++) {
            if (str.charAt(i) == '-') {
                count++;
            }
        }
        return count;
    }

    public static List<String> findWinnerList () {
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : winnerMap.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                winnerList.clear();
                winnerList.add(entry.getKey());
            } else if (max == entry.getValue()) {
                winnerList.add(entry.getKey());
            }
        }
        return winnerList;
    }

    public static void printWinner() {
        String winner = winnerList.toString();
        winner = winner.replace("[", "").replace("]", "").replace(" ", "");
        System.out.println(winner);
    }
}
