package Montayev_Chingis;

import java.util.Scanner;

public class Calculator {
    Scanner userInput = new Scanner(System.in);


    public void calculator() {
        try {
            regulations();
            String tempString = userInput.nextLine();
            String[] calcString = tempString.split(" ");
            int[] calcIntegers = new int[3];
            int result = 0;
            for (int i = 0; i <= calcString.length; i += 2) {
                if (parser(calcString[i])) {
                    int[] enumNumber = new int[3];
                    for (int x = 0; x <= calcString.length; x += 2) {
                        enumNumber[x] = Enum.toInt(calcString[x]);
                    }
                    if (!parser(calcString[2])) {
                        throw new NumberFormatException();
                    }
                    result = mathematicalActions(calcString, enumNumber);
                    System.out.println("result = " + CreationRomanNumber.toRoman(result));
                    return;
                }
                calcIntegers[i] = Integer.parseInt(calcString[i]);
                if (calcIntegers[i] > 10 || calcIntegers[i] < 0) {
                    throw new NumberFormatException();
                }
                if (parser(calcString[2])) {
                    throw new NumberFormatException();
                }
            }

            result = mathematicalActions(calcString, calcIntegers);
            System.out.println("result = " + result);
        } catch (Exception a) {
//            a.printStackTrace();
            System.out.println("ошибка введите коректно");
            calculator();
        }


    }

    private void regulations() {
        System.out.println("вводите числа через пробел, максимальное число 10");
        System.out.println("'пример 2 + 3'");
    }

    private int mathematicalActions(String[] calcString, int[] calcIntegers) {
        try {
            int result = 0;
            switch (calcString[1]) {
                case "+":
                    result = calcIntegers[0] + calcIntegers[2];
                    return result;
                case "-":
                    result = calcIntegers[0] - calcIntegers[2];
                    return result;

                case "*":
                    result = calcIntegers[0] * calcIntegers[2];
                    return result;

                case "/":
                    result = calcIntegers[0] / calcIntegers[2];
                    return result;

            }


        } catch (ArithmeticException e) {
            System.out.println();
        }
        return 0;
    }

    private boolean parser(String s) {
        boolean isString = false;
        String[] c = s.split("");
        for (int i = 0; i < c.length; i++) {
            try {
                isString = false;
                Integer.parseInt(c[i]);
            } catch (Exception e) {
                isString = true;
            }
            if (!isString) {
                break;
            }
        }
        return isString;
    }


}