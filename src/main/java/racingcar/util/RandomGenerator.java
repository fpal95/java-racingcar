package racingcar.util;

import java.util.Random;

public class RandomGenerator {
<<<<<<< HEAD

    private static final int MAX_RANGE_VALUE = 10;

    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_RANGE_VALUE);
=======
    public int generateRandomNumber(){
        Random random= new Random();
        return random.nextInt(9);
>>>>>>> 6d341c991 (feat(RandomGenerator): 랜덤값 생성 구현)
    }
}
