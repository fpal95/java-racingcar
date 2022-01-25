package racingcar;

<<<<<<< HEAD
import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
=======
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Java6Assertions.assertThat;

import java.util.Arrays;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
>>>>>>> 226cb95c4 (Test(carTest): 이름길이 및 랜덤값에 따른 position 테스트)
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.model.Car;

public class CarTest {

    @Test
<<<<<<< HEAD
    @DisplayName("자동차 이름이 5글자가 초과하면 IllegalException이 발생한다.")
    void 이름길이가_5글자_초과() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car("wooooni");
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 9})
    @DisplayName("랜덤값이 4이상일 경우 자동차는 전진한다.")
    void 자동차_전진(int randomNumber) {
=======
    void 이름길이() {
        Car car = new Car("wooooni");

        assertThatIllegalArgumentException()
            .isThrownBy((ThrowingCallable) car);
    }

    @ParameterizedTest
    @ValueSource(ints = {4,8,9})
    @DisplayName("4이상일 경우 전진")
    void 전진(int randomNumber) {
>>>>>>> 226cb95c4 (Test(carTest): 이름길이 및 랜덤값에 따른 position 테스트)
        Car car = new Car("wooni");
        car.moveForward(randomNumber);
        assertThat(car.getPosition()).isEqualTo("-");
    }

    @ParameterizedTest
<<<<<<< HEAD
    @ValueSource(ints = {0, 1, 3})
    @DisplayName("랜덤값이 4미만일 경우 자동차는 정지한다.")
    void 자동차_정지(int randomNumber) {
=======
    @ValueSource(ints = {0,1,3})
    @DisplayName("4미만일 경우 정지")
    void 정지(int randomNumber) {
>>>>>>> 226cb95c4 (Test(carTest): 이름길이 및 랜덤값에 따른 position 테스트)
        Car car = new Car("wooni");
        car.moveForward(randomNumber);
        assertThat(car.getPosition()).isEqualTo("");
    }
}

