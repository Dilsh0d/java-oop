package uz.java.oop.jse.statements;

public class Loops {

    public static void main(String[] args) {
        int[] b = {2,5,6,7,6,7,7,89,9,0};
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");

        System.out.println();
        int i = 0;
        for(;i<b.length;)
            System.out.print(b[i++]+" ");

        System.out.println();
        for(int variale:b)
            System.out.print(variale+" ");

        System.out.println();
        i = 0;
        while(i<b.length){
            System.out.print(b[i++]+" ");
        }

        System.out.println();
        i = 0;
        do{
            System.out.print(b[i++]+" ");
        }while(i<b.length);

        java.util.Arrays.sort(b);
        System.out.println();
        for(int variale:b)
            System.out.print(variale+" ");

    }
}
