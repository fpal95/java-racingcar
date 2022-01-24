package racingcar.model;

<<<<<<< HEAD
<<<<<<< HEAD
import racingcar.util.Message;
import racingcar.util.RandomGenerator;

public class Car {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6d17891ef (Fix: 매직넘버를 상수화)
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
=======
import racingcar.util.Message;
>>>>>>> 761a6ea3e (feat(Car): 자동차 이름 5글자 초과시 예외처리)
import racingcar.util.RandomGenerator;

public class Car {
=======

>>>>>>> 715c9de31 (style: 구글 자바 컨벤션 수정)
    private String carName;
    private String position;

    public Car(String carName) {
        validateCarNameLength(carName);
<<<<<<< HEAD
        this.carName= carName;
        this.position="";
>>>>>>> ae90941b6 (feat(Car): 사용자 입력값에 따라 car 생성)
=======
        this.carName = carName;
        this.position = "";
>>>>>>> 715c9de31 (style: 구글 자바 컨벤션 수정)
    }

    public void moveForward() {
        RandomGenerator randomGenerator = new RandomGenerator();
        int randomNumber = randomGenerator.generateRandomNumber();
        //System.out.println(randomNumber);
        if (randomNumber >= MOVING_CONDITION) {
            this.position += "-";
        }

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
