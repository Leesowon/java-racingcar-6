package racingcar;

import java.util.ArrayList;
import java.util.List;

public class EnterPlayerCars {
    List<String> playerCars = new ArrayList<>();

    public EnterPlayerCars(String input) {
        String[] players = input.split(",");
        for (int i = 0 ; i<players.length ; i++) {
            playerCars.add(players[i]);
        }
    }

    public void checkPlayerCars() {
        for(int i=0 ; i<playerCars.size() ; i++) {
            System.out.println(playerCars.get(i));
        }
    }
}
