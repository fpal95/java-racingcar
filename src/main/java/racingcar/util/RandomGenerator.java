package racingcar.util;

import java.util.Random;

public class RandomGenerator {
<<<<<<< HEAD
<<<<<<< HEAD

    private static final int MAX_RANGE_VALUE = 10;

    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_RANGE_VALUE);
=======
    public int generateRandomNumber(){
        Random random= new Random();
=======

    private static final int MAX_RANGE_VALUE = 10;

    public int generateRandomNumber() {
        Random random = new Random();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 715c9de31 (style: 구글 자바 컨벤션 수정)
        return random.nextInt(9);
>>>>>>> 6d341c991 (feat(RandomGenerator): 랜덤값 생성 구현)
=======
        return random.nextInt(maxNumber);
>>>>>>> 6f445e288 (fix: 무작위 값을 final변수로 수정)
=======
        return random.nextInt(MAX_RANGE);
>>>>>>> 7ad58015c (Remove: empty.txt파일 삭제)
=======
        return random.nextInt(MAX_RANGE_VALUE);
>>>>>>> 0c1b7b3f4 (Style: Google Java Convention에 따라 무작위 값의 명칭 수정)
    }
}
