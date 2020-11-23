package HW5;

public class Cat extends HomeAnimal{


    public Cat(String name) {
        super(name);
    }

    public void voise(){
    System.out.println("Cat say: Hello! My name is " + this.name + " Meow!");
}
}
