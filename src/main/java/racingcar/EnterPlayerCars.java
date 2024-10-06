package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class EnterPlayerCars {
    List<String> playerCars = new ArrayList<>();

    public EnterPlayerCars() { }

    void setPlayerCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        String[] players = input.split(",");
        for ( int i = 0 ; i<players.length ; i++) {
            playerCars.add(players[i]);
        }
    }

    void getPlayerCars() {
        for(int i=0 ; i<playerCars.size() ; i++) {
            System.out.println(playerCars.get(i));
        }
    }
}
