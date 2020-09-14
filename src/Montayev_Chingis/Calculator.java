package Montayev_Chingis;

import java.util.Scanner;

public class Calculator {
    Scanner userInput = new Scanner(System.in);


    public void cal() {
        try {
            System.out.println("вводите числа через пробел, максимальное число 9");
            System.out.println("'пример 2 + 3'");
            String tempString = userInput.nextLine();
            String[] calcString = tempString.split(" ");
            int[] calcIntegers = new int[3];
            int i = 0;
            for (i = 0; i <= calcString.length; i += 2) {
                calcIntegers[i] = Integer.parseInt(calcString[i]);
                if (calcIntegers[i] > 10 || calcIntegers[i] < 0 ) {
                    throw new NumberFormatException();
                }
            }

            int result = 0;
            switch (calcString[1]) {
                case "+":
                    result = calcIntegers[0] + calcIntegers[2];
                    System.out.println("result = " + result);
                    break;
                case "-":
                    result = calcIntegers[0] - calcIntegers[2];
                    System.out.println("result = " + result);
                    break;

                case "*":
                    result = calcIntegers[0] * calcIntegers[2];
                    System.out.println("result = " + result);
                    break;
                case "/":
                    result = calcIntegers[0] / calcIntegers[2];
                    System.out.println("result = " + result);
                    break;
            }
        } catch (Exception a) {
            System.out.println("ошибка введите коректно");
            cal();
        }


    }


}