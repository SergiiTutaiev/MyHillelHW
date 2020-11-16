package HW3;

import java.util.Arrays;

public class HW3_12 {

//    Найти среднее арифметическое всех элементов массива.

    public static void main(String[] args) {

        int[] myArray = {33, 79, 255, 255, 5, 5, 5};
        int sum = 0;
        double result = 0.0;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        result = sum / myArray.length;

        System.out.println("Cреднее арифметическое всех элементов массива " + Arrays.toString(myArray)+
                " равно " + result);
    }
}
