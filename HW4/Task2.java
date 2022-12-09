package HW4;
/* Написать программу, определяющую правильность расстановки скобок в выражении.
a+(d*3) - истина
\[a+(1*3) - ложь
\[6+(3*3)] - истина
{a}\[+\]{(d*3)} - истина
<{a}+{(d*3)}> - истина
{a+]}{(d*3)} - ложь */

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
//        String str = "a+(d*3)"; // истина
//        String str = "[a+(1*3))";  //  ложь
//        String str = "[6+(3*3)]";  //  истина
//        String str = "{a}[+]{(d*3)}";  //  истина
        String str = "<{a}+{(d*3)}>";  //  истина
 //       String str = "{a+]}{(d*3)}";  //  ложь

        String[] arr = str.split("");
        Stack<String> stack = new Stack<>();
        System.out.print(str + " - ");

        int startRoundBracket = 0;
        int endRoundBracket = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], "(")) {
                stack.add(arr[i]);
                startRoundBracket += 1;
            }
            if (Objects.equals(arr[i], ")")) {
                stack.add(arr[i]);
                endRoundBracket += 1;
            }
        }

        int startSquareBrackets = 0;
        int endSquareBrackets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], "[")) {
                stack.add(arr[i]);
                startSquareBrackets += 1;
            }
            if (Objects.equals(arr[i], "]")) {
                stack.add(arr[i]);
                endSquareBrackets += 1;
            }
        }

        int startCurlyBrackets = 0;
        int endCurlyBrackets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], "{")) {
                stack.add(arr[i]);
                startCurlyBrackets += 1;
            }
            if (Objects.equals(arr[i], "}")) {
                stack.add(arr[i]);
                endCurlyBrackets += 1;
            }
        }

        int startAngleBrackets = 0;
        int endAngleBrackets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], "<")) {
                stack.add(arr[i]);
                startAngleBrackets += 1;
            }
            if (Objects.equals(arr[i], ">")) {
                stack.add(arr[i]);
                endAngleBrackets += 1;
            }
        }

        if ((startRoundBracket  == endRoundBracket) &&
                (startSquareBrackets == endSquareBrackets) &&
                (startCurlyBrackets == endCurlyBrackets) &&
                (startAngleBrackets == endAngleBrackets)) {
            System.out.println("истина");
        }else {
            System.out.println("ложь");
        }
    }
}