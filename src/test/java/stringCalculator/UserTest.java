<<<<<<< HEAD
package stringCalculator;

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
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.assertj.core.api.ThrowableAssertAlternative;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import stringCalculator.Calculator;
import stringCalculator.User;
import stringCalculator.UserInputValue;

public class UserTest {

    @Test
    void 공백존재() {

        User user = new User();

        assertThatIllegalArgumentException()
            .isThrownBy(
                (ThrowingCallable) user.getUserInput(Arrays.asList("1", "+", "2", "*", " ", "4")));
    }

    @Test
    void 공백입력() {
        User user = new User();

        assertThatIllegalArgumentException()
            .isThrownBy(
                (ThrowingCallable) user.getUserInput(Arrays.asList("")));
    }

    @Test
    void 입력오류() {
        User user = new User();

        assertThatIllegalArgumentException()
            .isThrownBy(
                (ThrowingCallable) user.getUserInput(
                    Arrays.asList("1", "1", "+", "2", "+", "2", "-", "3")));
>>>>>>> ddff8d8f5 (Refactor(Calcluator): 사칙연산 예외처리 삭제)
    }
}
