package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        String result = "";
        double inputToDouble = Double.parseDouble(input);
        if (inputToDouble >= -128 && inputToDouble <= 127){
            result += "byte";
        }
        else if (inputToDouble >= -32768 && inputToDouble <= 32767){
            result += "short";
        }
        else if (inputToDouble >= -2147483648 && inputToDouble <= 2147483647){
            result += "int";
        }
        else if (inputToDouble >= -9223372036854775808L && inputToDouble <= 9223372036854775807L){
            result += "long";
        }
        else if (inputToDouble >= -3.4E+38 && inputToDouble <= 3.4E+38){
            result += "float";
        }
        else if (inputToDouble >= -1.7E+308 && inputToDouble <= 1.7E+308){
            result += "double";
        }

        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
        String itog = solution("2500000000");
        System.out.println(itog);
    }

}
