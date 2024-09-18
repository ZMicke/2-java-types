package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        float aToFloat = a;
        float bToFloat = b;
        float result = 0;

        switch(operation){
            case "+":
                result = aToFloat + bToFloat;
                break;
            case "-":
                result = aToFloat - bToFloat;
                break;
            case "*":
                result = aToFloat * bToFloat;
                break;
            case "/":
                result = aToFloat / bToFloat;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
        float itog = calculate(-100, 5, "/");
        System.out.println(itog);
    }

}
