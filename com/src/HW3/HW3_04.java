package HW3;

public class HW3_04 {

//    Перепишите программы (HW3_01 и HW3_02) с использованием цикла do - while

    public static void main(String[] args) {

        System.out.println("Нечетные числа от 1 до 99:");
        int n1 = 1;
        do {
        System.out.print(n1 + " ");
        n1 += 2;
        }
        while (n1 < 100);

        System.out.println();

        System.out.print("Факториал n! (при n=5) равен: ");
        int n2 = 5; //    поскольку по условию не оговаривается ввод числа из консоли, зададимся им сами
        int result = 1, i = 1;
        do {
            result = result*i;
            i++;
        }
        while (i <= n2);
        System.out.println(result);
    }
}

