package stringCalculator;

import java.util.List;

public class Application {
<<<<<<< HEAD

    public static void main(String[] args) {
        UserInputValue input = new UserInputValue();
        Calculator calculator = new Calculator();

        final List<String> userInput = input.userInput();
        int result = calculator.calculateByOperator(userInput);

        System.out.println(userInput);
=======
    public static void main(String[] args) {
        int result;
        User user = new User();
        final List<String> userInput= user.getUserInput();
        System.out.println(userInput);
        Calculator calculator= new Calculator();
        result= calculator.calculateByOperator(userInput);
>>>>>>> 715512a55 (refactor: calculator 패키지로 이동)
        System.out.println(result);
    }
}
