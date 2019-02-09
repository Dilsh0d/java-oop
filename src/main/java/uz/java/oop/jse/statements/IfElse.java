package uz.java.oop.jse.statements;

public class IfElse {

    public static void main(String[] args) {
        int a = 0;
        int b = 2;

        if (a == b)
            System.out.println("a Равно на b");
        else if (a > b)
            System.out.println("a Болше чем b");
        else if (a != b)
            System.out.println("a не равно на b");
        else
            System.out.println("a Менше чем b");

        // ternary
        boolean aMoreThanB = a > b ? true : false;

        System.out.println("a Болше чем b "+ aMoreThanB);
    }
}
