package HW3;

public class HW3_13 {

//    Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W  ");
                } else
                    System.out.print("B  ");
            }
            System.out.println();
        }
    }
}
