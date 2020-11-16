package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW3_07 {
//    Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
//    я сделал таблицу до 10

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число Х для которого необходимо вывести таблицу умножения");
        int x = Integer.parseInt(reader.readLine());

        System.out.println("Таблица иножения на Х:");

        for (int i = 1; i <= x; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
