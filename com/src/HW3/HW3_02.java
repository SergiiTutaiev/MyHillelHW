package HW3;

public class HW3_02 {

//    Дано число n при помощи цикла for посчитать факториал n!


    public static void main(String[] args) {

        int n = 5;
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result*i;
        }
        System.out.println("Факториал !" + n + " равен " + result);
    }
}
