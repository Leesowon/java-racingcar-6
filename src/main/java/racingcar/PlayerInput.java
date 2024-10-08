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
        List<String> players = splitPlayers(input);
        addPlayerCarsList(players);
    }

    private List<String> splitPlayers(String input) {
        String[] playersArray = input.split(",");
        List<String> playersList = new ArrayList<>();
        for (String player : playersArray) {
            playersList.add(player);
        }
        return playersList;
    }

    private void addPlayerCarsList(List<String> players) {
        playerCars.addAll(players);
    }

    private void checkIllegal() throws IllegalArgumentException {
        String[] players = input.split(",");
        checkPlayerNameLength(players);
    }

    private void checkPlayerNameLength(String[] players) throws IllegalArgumentException {
        for (String player : players) {
            validatePlayerNameLength(player);
        }
    }

    private void validatePlayerNameLength(String player) {
        if (player.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하로 작성해야 합니다.");
        }
    }


    public void checkPlayerCars() {
        for(int i=0 ; i<playerCars.size() ; i++) {
            System.out.println(playerCars.get(i));
        }
    }
}
