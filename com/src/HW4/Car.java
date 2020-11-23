package HW4;

import java.sql.SQLOutput;

public class Car {
    static double volume;        // объем бака
    static double remainder;     // остаток в баке
    static int fuelConsumption;  // расход топлива на 100 км
    static double n;             // расстояние
    static int p = 28;    // стоимость топлива

    public Car(double v, double r, int f){
        this.volume = v;
        this.remainder = r;
        this.fuelConsumption = f;
    }
    static double refueling(){         // заправка до полного
        System.out.println("Вы заправили до полного бака " + (volume - remainder) + " литров или на " +
                (volume - remainder)*p + " грн.");
        return (volume - remainder);
    }
    public static double remainder(){         // остаток топлива после N
        return (volume - fuelQuantity(n));
    }
    public static double fuelQuantity(double n){   //нужно залить заправить после N
        return (n/100*fuelConsumption);
    }

    public static void main(String[] args) {

        Car car = new Car(50.0, 25.0, 10);
        n=480;

        System.out.println("Для поездки Одесса - Киев протяженностью " + n + " км понадобится " + fuelQuantity(n) +
                " литров топлива или " + p*fuelQuantity(n) + " грн.");
        refueling();
        n=180; // расстояние Одесса - Кривое озеро
        System.out.println("Дозаправка в Кривом озере " + fuelQuantity(n) +
                " литров топлива или на " + p*fuelQuantity(n) + " грн.");
        n=160; // расстояние Кривое озеро - Жашков
        System.out.println("Дозаправка в Жашкове " + fuelQuantity(n) +
                " литров топлива или на " + p*fuelQuantity(n) + " грн.");
        n = 140;
        System.out.println("Остаток топлива в баке по приезду в Киев: " + remainder() +
                " литров топлива");

    }
}
