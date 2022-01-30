package stringCalculator;

import java.util.List;

public class Calculator {

    public int calculateByOperator (List<String> userInput){
<<<<<<< HEAD
<<<<<<< HEAD
        int result = Integer.parseInt(userInput.get(0));

        for (int i=1; i<userInput.size()-1; i+=2){
            int nextNumber = Integer.parseInt(userInput.get(i+1));

            switch(userInput.get(i)) {
                case "+":
                    result = sum(result, nextNumber);
                    continue;
                case "-":
                    result = subtract(result, nextNumber);
                    continue;
                case "*":
                    result = multiply(result, nextNumber);
                    continue;
                case "/":
                    result = divide(result, nextNumber);
                    continue;
            }
=======
        int result=Integer.parseInt(userInput.get(0));
=======
        int result = Integer.parseInt(userInput.get(0));
>>>>>>> 2ca9923fe (Refactor(Calculator): if~else문을 switch~case문으로 수정)

        for (int i=1; i<userInput.size()-1; i+=2){
            int nextNumber = Integer.parseInt(userInput.get(i+1));

            switch(userInput.get(i)) {
                case "+":
                    result = sum(result, nextNumber);
                    continue;
                case "-":
                    result = subtract(result, nextNumber);
                    continue;
                case "*":
                    result = multiply(result, nextNumber);
                    continue;
                case "/":
                    result = divide(result, nextNumber);
                    continue;
            }
<<<<<<< HEAD
            throw new IllegalArgumentException("사칙 연산이 아닙니다");
>>>>>>> 715512a55 (refactor: calculator 패키지로 이동)
=======
>>>>>>> ddff8d8f5 (Refactor(Calcluator): 사칙연산 예외처리 삭제)
        }
        return result;
    }
    private int sum (int a, int b){
        return a +b;
    }
    private int subtract(int a, int b){
        return a-b;
    }
    private int multiply(int a, int b){
        return a*b;
    }
    private int divide(int a, int b){
        return a/b;
    }
}
