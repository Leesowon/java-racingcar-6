package racingcar;

import java.util.ArrayList;
import java.util.List;

public class PlayerInput {
    List<String> playerCars = new ArrayList<>();

    public PlayerInput() { }

    public List<String> getPlayerList() {
        return playerCars;
    }

    public void setPlayerList(String input) {
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
