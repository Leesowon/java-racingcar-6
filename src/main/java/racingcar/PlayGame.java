package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class PlayGame {

    public PlayGame() { }

    public void playGame() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        EnterPlayerCars players = new EnterPlayerCars(input);

        System.out.println("시도할 회수는 몇회인가요?");
        int inputAttempts = Integer.parseInt(Console.readLine());
        GetNumberOfAttempts attempts = new GetNumberOfAttempts();
        attempts.setAttempts(inputAttempts);

        System.out.println("실행 결과");


    }


}
