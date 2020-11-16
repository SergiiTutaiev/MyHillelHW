package HW3;

import java.util.Arrays;

public class HW3_11 {

//    Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.
//    После замены будет выглядеть {4, 8, 0, 6, -5}

    public static void main(String[] args) {

        int[] myArray = {4, -5, 0, 6, 8};
        System.out.println("Начальный массив: " + Arrays.toString(myArray));
        int max = myArray[0];
        int min = myArray[0];
// Поиск минимума
        for(int i = 0; i != myArray.length; i ++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
// Поиск максимума
        for(int i = 0; i != myArray.length; i ++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
// Поиск номеров ячеек содержащих мин и макс
        int n=0, m=0;
        for(int i = 0; i != myArray.length; i ++) {
            if (myArray[i] == min) {
                n = i;
            }
            if (myArray[i] == max) {
                m = i;
            }
        }
// Перестановка
        int k = myArray[n];; // Временная запись одного из элементов
        myArray[n] = myArray[m];
        myArray[m] = k;
        System.out.println("Конечный массив:  " + Arrays.toString(myArray));

    }
}
