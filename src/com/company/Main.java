package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Double[] number = {4.5, 5.6, -4.5, 4.6, 6.5, 7.5, -4.5, 4.5, 4.5, 1.4, -4.5, -5.3, 34.2, 5.6, 3.5};
        System.out.println(Arrays.toString(number));
        Double result = 0.0;
        Boolean a = false;
        for (Double element: number){
            result += element;
            if (element >= 0) {
                a = true;
            }
            else if (element < 0){
                a = false;
            }

        }
        System.out.println("среднее арифметическое положительных " +
                "чисел расположенных после первого отрицательного числа = " + result/ number.length);

        System.out.println("---------------------------");
        //ДОП ДЗ
        int[] array = {5, 34, -7, -13, 3, 0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
