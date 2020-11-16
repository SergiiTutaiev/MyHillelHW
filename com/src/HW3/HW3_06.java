package HW3;

public class HW3_06 {
//    Вывести 10 первых чисел последовательности 0, -5,-10,-15..

    public static void main(String[] args) {
        int n = 0, i = 1;
        while (i <= 10) {
            if (i != 10) System.out.print(n + ", ");
            else System.out.println(n + ".");
            n = n - 5;
            i++;
        }
    }
}
