package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class StartGame {

    public StartGame() { }

    public void startGame() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine(); // 문자열로 입력 받고,
        PlayerInput players = new PlayerInput();
        players.setPlayerList(input);
//        players.checkPlayerCars();

        System.out.println("시도할 회수는 몇회인가요?");
        int inputAttempts = Integer.parseInt(Console.readLine());

        System.out.println("실행 결과");
        new PlayGame(players.getPlayerList(), inputAttempts); // arraylist, int
        PlayGame.makePlayerDict(players.getPlayerList());
        PlayGame.run();
        PlayGame.printResult();

        System.out.print("최종 우승자 : ");
        new PrintWinner(PlayGame.getPlayerdic());
        PrintWinner.howLongGo();
//        PrintWinner.printWinnerMap();
        PrintWinner.findWinnerList();
//        PrintWinner.printWinnerList();
        PrintWinner.printWinner();
    }
}
