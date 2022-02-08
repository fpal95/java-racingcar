package racingcar.view;

import java.util.ArrayList;
import racingcar.model.Car;
import racingcar.util.Message;

public class OutputView {
    public static void printResult(String carName, String position){
      System.out.println(carName+ ": "+ position );
    }
    public static void printWinner(ArrayList<String> winnerList){
        System.out.print(Message.WINNER_MESSAGE);
        System.out.print(String.join(",",winnerList));
    }
}
