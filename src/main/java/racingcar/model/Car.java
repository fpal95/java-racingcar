package racingcar.model;

import racingcar.util.Message;

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

    public int checkMaxPosition(int maxPosition) {
        return Math.max(this.position.length(), maxPosition);
    }

    public boolean isMaxPosition(int maxPosition) {
        return this.position.length() == maxPosition;
    }

    private void validateCarNameLength(String carName) {
        if (carName.length() > NAME_LENGTH) {
            throw new IllegalArgumentException(Message.CAR_NAME_ERROR);
        }
    }

    public String getCarName() {
        return carName;
    }

    public String getPosition() {
        return position;
    }
}
