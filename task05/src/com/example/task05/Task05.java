package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        String xS = Integer.toString(x);
        int count = 0;
        String result = "";
        do{
            if ((x % 10) % 2 == 0){
                count++;
            }
            x /= 10;
        }while (x != 0);
        if (count == xS.length()){
            result += "TRUE";
        }
        else{
            result += "FALSE";
        }
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
        String itog = solution(22244666);
        System.out.println(itog);
    }

}
