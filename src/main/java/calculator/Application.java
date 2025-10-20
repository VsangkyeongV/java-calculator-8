package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {

    public int Sum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
                int num = Integer.parseInt(number);
                sum += num;
            }
        return sum;
    }

    public int calculateSum(String str) {
        int sum = 0;
        String[] numbers;

        if (str.isEmpty()) {
            return 0;
        }

        if (Character.isDigit(str.charAt(0))) {//기본 구분자
            numbers = str.split("[,:]");

        } else if (str.startsWith("//")) {//커스텀 구분자
            String customString = str.substring(2, str.indexOf("\\n"));
            String numString = str.substring(str.indexOf("\\n") + 2);
            numbers = numString.split("[" + customString + "]");

        } else {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }

        sum = Sum(numbers);

        return sum;
    }

    public void run() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        int result = calculateSum(input);
        System.out.println("결과 : "+ result);
    }
   
    public static void main(String[] args) {
        new Application().run();
       
    }
}