package racingcar;

import org.mockito.internal.util.StringUtil;

import java.util.*;

public class PrintWinner {
    static Map<String, String> playerdic = new HashMap<>();
    static HashMap<String, Integer> winnerMap = new HashMap<String, Integer>();
    static List<String> winnerList = new ArrayList<>();

    public PrintWinner(Map<String, String> playerdic) {
        this.playerdic = playerdic;
    }

    public static Map<String, Integer> howLongGo () {
        for (Map.Entry<String,String> entry : playerdic.entrySet()) {
            int count = 0;
            String str = entry.getValue();
            for (int i=0 ; i<str.length() ; i++) {
                if (str.charAt(i) == '-') {
                    count++;
                }
            }
            winnerMap.put(entry.getKey(), count);
        }
        return winnerMap;
    }

//    public static void printWinnerMap () {
//        System.out.println("winnerMap");
//        for (Map.Entry<String, Integer> entry : winnerMap.entrySet()) {
//            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
//        }
//    }

    public static List<String> findWinnerList () {
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : winnerMap.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                winnerList.clear();
                winnerList.add(entry.getKey());
            } else if (max == entry.getValue()) {
                winnerList.add(entry.getKey());
            } else {
                continue;
            }
        }
        return winnerList;
    }

//    public static void printWinnerList() {
//        for (int i = 0 ; i < winnerList.size() ; i++) {
//            System.out.println(winnerList.get(i));
//        }
//    }

    public static void printWinner() {
        String winner = winnerList.toString();
        winner = winner.replace("[", "").replace("]", "").replace(" ", "");
        System.out.println(winner);
    }
}
