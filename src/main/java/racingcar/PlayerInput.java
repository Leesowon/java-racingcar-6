package racingcar;

import java.util.ArrayList;
import java.util.List;

public class PlayerInput {
    String input = "";
    List<String> playerCars = new ArrayList<>();

    public PlayerInput() { }

    public List<String> getPlayerList() {
        return playerCars;
    }

    public void setPlayerList(String input) throws IllegalArgumentException {
        this.input = input;
        checkIllegal();
        String[] players = input.split(",");
        for (int i = 0; i < players.length; i++) {
            playerCars.add(players[i]);
        }
    }

    private void checkIllegal() throws IllegalArgumentException {
        String[] players = input.split(",");
        for (String player : players) {
            if (player.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5글자 이하로 작성해야합니다.");
            }
        }
    }

    public void checkPlayerCars() {
        for(int i=0 ; i<playerCars.size() ; i++) {
            System.out.println(playerCars.get(i));
        }
    }
}
