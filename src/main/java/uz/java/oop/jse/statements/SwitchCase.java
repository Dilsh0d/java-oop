package uz.java.oop.jse.statements;

public class SwitchCase {

    public static void main(String[] args) {
        int sc = 2;
        switch (sc) {
            case 1: {
                System.out.println("Case 1");
                break;
            }
            case 2: {
                System.out.println("Case 2");
                break;
            }
            default:{
                System.out.println("Default");
            }
        }
    }
}
