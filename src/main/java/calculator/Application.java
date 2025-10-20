package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {

    public int calculateSum(String input) {
        int sum = 0;
        String str = input;

        if (str.isEmpty()) {
            return 0;
        }
        
        if (Character.isDigit(str.charAt(0))) {
            String[] numbers = str.split("[,:]");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                sum += num;
            }
        }

        return sum;
    }

   
    public static void main(String[] args) {
        Application app = new Application();
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        int result = app.calculateSum(input);
        System.out.println("결과 : "+ result);
    }
}