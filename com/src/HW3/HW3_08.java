package HW3;

public class HW3_08 {
//    Создайте массив, содержащий 10 первых нечетных чисел.
//    Выведете элементы массива на консоль в одну строку, разделяя запятой.

    public static void main(String[] args) {

        int[] myArray = new int[10];
        int j = 1;

        for (int i = 0;  i < myArray.length; i++) {
            myArray[i] = j;
            if (i == myArray.length - 1 ) System.out.print(myArray[i] + ".");
            else System.out.print(myArray[i] + ", ");
            j = j +2;
        }
    }
}
