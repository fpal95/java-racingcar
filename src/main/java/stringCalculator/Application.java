package stringCalculator;

import java.util.List;

public class Application {
<<<<<<< HEAD
<<<<<<< HEAD

    public static void main(String[] args) {
        UserInputValue input = new UserInputValue();
<<<<<<< HEAD
        Calculator calculator = new Calculator();

        final List<String> userInput = input.userInput();
        int result = calculator.calculateByOperator(userInput);

        System.out.println(userInput);
=======
=======

>>>>>>> 8274bb7d0 (Fix: result의 변수 선언과 초기화 수정)
    public static void main(String[] args) {
=======
>>>>>>> 1e4cd40e4 (Fix(Application): UserInputValue.java 생성자 추가)
        User user = new User();
        final List<String> userInput = user.getUserInput(input.userInput());
        System.out.println(userInput);
<<<<<<< HEAD
        Calculator calculator= new Calculator();
        result= calculator.calculateByOperator(userInput);
>>>>>>> 715512a55 (refactor: calculator 패키지로 이동)
=======
        Calculator calculator = new Calculator();
        int result = calculator.calculateByOperator(userInput);
>>>>>>> 8274bb7d0 (Fix: result의 변수 선언과 초기화 수정)
        System.out.println(result);
    }
}
