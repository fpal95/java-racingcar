<<<<<<< HEAD
<<<<<<< HEAD
package stringCalculator;

<<<<<<< HEAD
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void 빈문자열만_입력하면_예외가_발생한다() {
        UserInputValue user = new UserInputValue();

        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> user.validateBlankCarName(Arrays.asList("")));
    }

    @Test
    void 연산자_자리에_숫자를_입력하면_얘외가_발생한다() {
        UserInputValue user = new UserInputValue();

        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> user.validateEmptyNumber(Arrays.asList("1", "+", "-", "+", "2", "-", "3")));
    }

    @Test
    void 숫자_자리에_연산자를_입력하면_예외가_발생한다() {
        UserInputValue user = new UserInputValue();

        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> user.validateEmptyOperation(Arrays.asList( "1", "+", "9", "0", "2", "-", "3")));
=======
=======
package stringCalculator;

>>>>>>> 25abd8cc2 (Fix(UserTest): 테스트 케이스 수정)
import static org.assertj.core.api.Assertions.assertThat;
=======
>>>>>>> 685a00d11 (Refactor(UserTest): test case 수정)
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void 빈문자열만_입력하면_예외가_발생한다() {
        UserInputValue user = new UserInputValue();

        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> user.validateBlankCarName(Arrays.asList("")));
    }

    @Test
    void 연산자_자리에_숫자를_입력하면_얘외가_발생한다() {
        UserInputValue user = new UserInputValue();

<<<<<<< HEAD
        assertThatIllegalArgumentException()
            .isThrownBy(
                (ThrowingCallable) user.getUserInput(
                    Arrays.asList("1", "1", "+", "2", "+", "2", "-", "3")));
>>>>>>> ddff8d8f5 (Refactor(Calcluator): 사칙연산 예외처리 삭제)
=======
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> user.validateEmptyNumber(Arrays.asList("1", "+", "-", "+", "2", "-", "3")));
    }

    @Test
    void 숫자_자리에_연산자를_입력하면_예외가_발생한다() {
        UserInputValue user = new UserInputValue();

        assertThatExceptionOfType(IllegalArgumentException.class)
<<<<<<< HEAD
            .isThrownBy(() -> user.getUserInput(Arrays.asList( "1", "+", "*", "+", "2", "-", "3")));
>>>>>>> 25abd8cc2 (Fix(UserTest): 테스트 케이스 수정)
=======
            .isThrownBy(() -> user.validateEmptyOperation(Arrays.asList( "1", "+", "9", "0", "2", "-", "3")));
>>>>>>> 685a00d11 (Refactor(UserTest): test case 수정)
    }
}
