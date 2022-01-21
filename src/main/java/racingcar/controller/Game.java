package racingcar.controller;

import java.util.ArrayList;
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
import racingcar.model.Car;
import racingcar.model.User;
import racingcar.util.Message;
import racingcar.view.OutputView;

public class Game {

    public void play() {
        ArrayList<String> carNameList;
        String[] carNames; //입력 받은 자동차 이름들
        int tryCount;
        ArrayList<Car> carList = new ArrayList<>(); //경주를 하는 car 모음
        //ArrayList<Car> winnerList = new ArrayList<>();
        User user = new User();

        System.out.println(Message.INPUT_GUIDE_MESSAGE);
        carNames = user.getCarName();
        System.out.println(Message.ASK_TRY_COUNT);
        tryCount = user.getTryCount();

        for (int i = 0; i < carNames.length; i++) {
            carList.add(new Car(carNames[i])); //car 객체 생성
        }
        System.out.println(Message.GAME_RESULT_MESSAGE);
        for (int i = 0; i < tryCount; i++) {
            moveForwardByCount(carList);
        }

        checkWinner(carList);
    }

    public void moveForwardByCount(ArrayList<Car> carList) {
        OutputView outputView = new OutputView();
        for (Car car : carList) {
            car.moveForward();
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

    public void checkWinner(ArrayList<Car> carList) {
        ArrayList<String> winnerList = new ArrayList<>();
        OutputView outputView = new OutputView();
        int maxPosition = 0;
        for (Car car : carList) {
            if (car.getPosition().length() > maxPosition) {
                maxPosition = car.getPosition().length();
>>>>>>> 715c9de31 (style: 구글 자바 컨벤션 수정)

            }
        }
        for (Car car : carList) {
            if (car.getPosition().length() == maxPosition) {
                winnerList.add(car.getCarName());
            }
        }
        outputView.printWinner(winnerList);
    }
>>>>>>> 19c431d9a (feat(Game): 우승자 체크 기능 구현)
}
