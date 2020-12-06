package HW6;

import HW6.interfaces.Voice;

public class Hamster extends HomeAnimal implements Voice {


    public Hamster(String name) {
        super(name);
    }

    public void voise() {

        System.out.println("Hamster say: Hello! My name is " + this.name + ".");
    }

}
