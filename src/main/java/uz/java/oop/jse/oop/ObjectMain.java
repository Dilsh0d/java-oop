package uz.java.oop.jse.oop;

import uz.java.oop.jse.oop.phones.Samsung2Phone;

public class ObjectMain {

    public static void main(String[] args){
        // Create object
        Samsung2Phone samsung2Phone = new Samsung2Phone();

        // Overload
        samsung2Phone.call(new char[]{'1','0','3'});
        samsung2Phone.call("+998 93 570 94 16");

        // Encapsulation
        System.out.println(samsung2Phone.getName()+" "+samsung2Phone.getVersion());
    }
}
