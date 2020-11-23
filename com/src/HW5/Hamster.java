package HW5;

public class Hamster extends HomeAnimal{


    public Hamster(String name) {
        super(name);
    }

    public void voise() {
        System.out.println("Hamster say: Hello! My name is " + this.name + ".");
    }

}
