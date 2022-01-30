package racingcar.controller;

import java.util.ArrayList;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.List;
import racingcar.model.Car;
import racingcar.view.InputView;
import racingcar.util.Message;
import racingcar.util.RandomGenerator;
import racingcar.view.OutputView;

public class Game {
    private List<Car> carList = new ArrayList<>();

    public void play() {
        InputView inputView = new InputView();

        System.out.println(Message.INPUT_GUIDE_MESSAGE);
        String[] carNames = inputView.getCarName();

        for (String carName:carNames) {
            Car carInformation = new Car(carName);
            carList.add(carInformation);
        }

        System.out.println(Message.ASK_TRY_COUNT);
        int tryCount = inputView.getTryCount();

        System.out.println(Message.GAME_RESULT_MESSAGE);
        for (int i = 0; i < tryCount; i++) {
            moveForwardByCount();
        }
        checkWinner();
    }

    public void moveForwardByCount() {
        RandomGenerator randomGenerator = new RandomGenerator();
        OutputView outputView = new OutputView();
        for (Car car : carList) {
            int randomNumber = randomGenerator.generateRandomNumber();
            car.moveForward(randomNumber);
            outputView.printResult(car.getCarName(), car.getPosition());
        }
        System.out.println();
    }

    public void checkWinner() {
        OutputView outputView = new OutputView();

        int maxPosition = maximumDistance();
        ArrayList<String> winners = winnerList(maxPosition);

        outputView.printWinner(winners);
    }

    public ArrayList<String> winnerList(int maxPosition) {
        ArrayList<String> winners = new ArrayList<>();

        for (Car car : carList) {
            if (car.getPosition().length() == maxPosition) {
                winners.add(car.getCarName());
            }
        }
        return winners;
    }

    private int maximumDistance() {
        int maxPosition = 0;
        for (Car car : carList) {
            if (car.getPosition().length() > maxPosition) {
                maxPosition = car.getPosition().length();
            }
        }
        return maxPosition;
    }
=======
import java.util.Comparator;
=======
>>>>>>> e766fb80f (Refactor(Game): InputView 객체 생성)
=======
import java.util.List;
>>>>>>> 3b2dba576 (Refactor(Game): winnerList, maximumDistance 메서드 생성)
import racingcar.model.Car;
import racingcar.view.InputView;
import racingcar.util.Message;
import racingcar.util.RandomGenerator;
import racingcar.view.OutputView;

public class Game {
    private List<Car> carList = new ArrayList<>();

    public void play() {
        InputView inputView = new InputView();

        System.out.println(Message.INPUT_GUIDE_MESSAGE);
        String[] carNames = inputView.getCarName();

        for (String carName:carNames) {
            Car carInformation = new Car(carName);
            carList.add(carInformation);
        }

        System.out.println(Message.ASK_TRY_COUNT);
        int tryCount = inputView.getTryCount();

        System.out.println(Message.GAME_RESULT_MESSAGE);
        for (int i = 0; i < tryCount; i++) {
            moveForwardByCount();
        }
        checkWinner();
    }

    public void moveForwardByCount() {
        RandomGenerator randomGenerator = new RandomGenerator();
        OutputView outputView = new OutputView();
        for (Car car : carList) {
            int randomNumber = randomGenerator.generateRandomNumber();
            car.moveForward(randomNumber);
            outputView.printResult(car.getCarName(), car.getPosition());
        }
        System.out.println();
    }
<<<<<<< HEAD
<<<<<<< HEAD

>>>>>>> 964c3fede (feat(Game): 자동차 게임 진행 구현)
=======
    public void checkWinner(ArrayList<Car> carList){
        ArrayList<String> winnerList= new ArrayList<>();
        OutputView outputView= new OutputView();
        int maxPosition=0;
        for (Car car :carList){
            if(car.getPosition().length()>maxPosition){
                maxPosition=car.getPosition().length();
=======

    public void checkWinner() {
        OutputView outputView = new OutputView();

        int maxPosition = maximumDistance();
        ArrayList<String> winners = winnerList(maxPosition);

        outputView.printWinner(winners);
    }

    public ArrayList<String> winnerList(int maxPosition) {
        ArrayList<String> winners = new ArrayList<>();

        for (Car car : carList) {
<<<<<<< HEAD
            if (car.getPosition().length() > maxPosition) {
                maxPosition = car.getPosition().length();
<<<<<<< HEAD
>>>>>>> 715c9de31 (style: 구글 자바 컨벤션 수정)

=======
>>>>>>> 34ab2253a (Refactor(Game): randomNumber선언)
=======
            if (car.getPosition().length() == maxPosition) {
                winners.add(car.getCarName());
>>>>>>> 3b2dba576 (Refactor(Game): winnerList, maximumDistance 메서드 생성)
            }
        }
        return winners;
    }

    private int maximumDistance() {
        int maxPosition = 0;
        for (Car car : carList) {
            if (car.getPosition().length() > maxPosition) {
                maxPosition = car.getPosition().length();
            }
        }
        return maxPosition;
    }
>>>>>>> 19c431d9a (feat(Game): 우승자 체크 기능 구현)
}
