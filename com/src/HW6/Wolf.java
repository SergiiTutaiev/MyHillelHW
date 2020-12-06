package HW6;

import HW6.interfaces.Voice;

public class Wolf extends WildAnimal implements Voice {
    public void voise() {

        System.out.println("Wolf say: Hello! I am a wild animal. I am angry");
    }
}
