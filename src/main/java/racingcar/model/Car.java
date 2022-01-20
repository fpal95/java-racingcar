package racingcar.model;

<<<<<<< HEAD
import racingcar.util.Message;
import racingcar.util.RandomGenerator;

public class Car {
    private static final int MOVING_CONDITION = 4;
    private static final int NAME_LENGTH = 5;

    private String carName;
    private String position;

    public Car(String carName) {
        validateCarNameLength(carName);
        this.carName = carName;
        this.position = "";
    }

    public void moveForward(int randomNumber) {
        if (randomNumber >= MOVING_CONDITION) {
            this.position += "-";
        }

    }

    private void validateCarNameLength(String carName) {
        if (carName.length() > NAME_LENGTH) {
            throw new IllegalArgumentException(Message.CAR_NAME_ERROR);
        }
=======
import racingcar.util.RandomGenerator;

public class Car {
    private String carName;
    private String position;
    public Car(String carName){
        this.carName= carName;
        this.position="";
>>>>>>> ae90941b6 (feat(Car): 사용자 입력값에 따라 car 생성)
    }

    public String getCarName() {
        return carName;
    }

    public String getPosition() {
        return position;
    }
}
