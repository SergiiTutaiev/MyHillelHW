package HW3;

public class HW3_05 {
//    Даны переменные x и n вычислить x^n.

    public static void main(String[] args) {

        int x = 5, n = 3, result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        System.out.println(x + " в степени " + n + " равно " + result);
    }
}
