package HW6;

import HW6.interfaces.Voice;

public class Cat extends HomeAnimal implements Voice {


    public Cat(String name) {
        super(name);
    }

    public void voise(){

        System.out.println("Cat say: Hello! My name is " + this.name + " Meow!");
}
}
