package HW6;

import HW6.interfaces.Voice;

public class Dog extends HomeAnimal implements Voice {


    public Dog(String name) {
        super(name);
    }

    public void voise() {

        System.out.println("Dog say: Hello! My name is " + this.name + ". Woof!");
    }
}
