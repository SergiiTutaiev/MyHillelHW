package HW5;

public class GuideDog extends Dog{
    boolean isTrained = true;

    public GuideDog(String name) {
        super(name);
    }


    public void voise() {
        System.out.println("GuideDog say: Hello! My name is " + this.name + ". I can take you home.");
    }



}
