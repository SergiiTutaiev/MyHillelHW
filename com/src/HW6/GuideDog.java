package HW6;

import HW6.interfaces.TakeHome;
import HW6.interfaces.Voice;

public class GuideDog extends Dog implements Voice, TakeHome {
    boolean trained = true;

    public GuideDog(String name) {
        super(name);
    }


    public void voise() {
        System.out.print("GuideDog say: Hello! My name is " + this.name + ". ");
    }

    public void takeHome() {
        System.out.println(" I can take you home.");
    }
}
