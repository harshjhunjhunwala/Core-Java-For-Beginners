package main.java.concept;

public class InitializationBlock {

    private int a = 5;
    private int b = 7;

    {
        a += b;
    }


    public InitializationBlock()
    {
        System.out.println("Value of a at default constructor is " +a);
    }

    public InitializationBlock(int c)
    {
        this();
        System.out.println("Value of a with parameter constructor"+a);
        a = 100;

        c = a;
        System.out.println("value of c is "+c);
    }

    public static void main(String[] args)
    {

        InitializationBlock d = new InitializationBlock(3);

    }
}
