package HW6;

public class AnimalMain {

    public static void main(String[] args) {

        Cat cat = new Cat("Murzik");
        cat.voise();

        Crocodile crocodile = new Crocodile();
        crocodile.voise();

        Dog dog = new Dog("Sharik");
        dog.voise();

        Fish fish = new Fish();
        fish.voise();

        Giraf giraf = new Giraf();
        giraf.voise();

        GuideDog guideDog = new GuideDog("Bobik");
        guideDog.voise();
        guideDog.takeHome();

        Hamster hamster = new Hamster("Homa");
        hamster.voise();

        Lion lion = new Lion();
        lion.voise();

        Wolf wolf = new Wolf();
        wolf.voise();

    }
}


