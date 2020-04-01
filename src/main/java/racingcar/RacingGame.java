package racingcar;

import racingcar.car.CarCollection;
import racingcar.car.RandomEngine;

public class RacingGame {

    private int numberOfTry;
    private CarCollection cars;

    public RacingGame(int numberOfTry, String carNames) {
        this.numberOfTry = numberOfTry;
        this.cars = new CarCollection(carNames, RandomEngine.class);
    }

    public RacingGameResult run() {
        drive();
        return cars.getResult();
    }

    private void drive() {
        for(int i = 0; i < numberOfTry; i++) {
            cars.move();
        }
    }
}
