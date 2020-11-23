package HW5;

public class Dog extends HomeAnimal {


    public Dog(String name) {
        super(name);
    }

    public void voise() {
        System.out.println("Dog say: Hello! My name is " + this.name + ". Woof!");
    }
}
