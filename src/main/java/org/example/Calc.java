package org.example;

public class Calc {

    public int summ(int a, int b) {
        int sumResult;
        sumResult = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, sumResult);
        //System.out.println("Сумма " + a + " и " + b + " равно " + result);
        return sumResult;
    }

    public int remove(int a, int b) {
        int removeResult;
        removeResult = a - b;
        System.out.printf("Разница %d и %d равна %d\n", a, b, removeResult);
        return removeResult;
    }
}
