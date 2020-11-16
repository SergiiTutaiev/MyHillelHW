package HW3;

public class HW3_09and10 {

// Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
// (если наименьших элементов несколько — вывести их все).
// В массиве из задания 9. найти наибольший элемент.

    public static void main(String[] args){

        int[] myArray = {33, 79, 255, 255, 5, 5, 5};
        int max = myArray[0];
        int min = myArray[0];

        int minCount = 0;
        int maxCount = 0;

        for(int i = 0; i != myArray.length; i ++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        for(int i = 0; i != myArray.length; i ++) {
            if (myArray[i] == min) {
                minCount++;
                System.out.print(min + " ");
            }
        }
        System.out.println(" - миниимальных элементов массива " + minCount);

        for(int i = 0; i != myArray.length; i ++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        for(int i = 0; i != myArray.length; i ++) {
            if (myArray[i] == max) {
                maxCount++;
                System.out.print(max + " ");
            }
        }
        System.out.print(" - максимальных элементов массива " + maxCount);
    }
}
