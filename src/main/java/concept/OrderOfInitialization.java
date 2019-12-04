package main.java.concept;

public class OrderOfInitialization {

    private int field=3;

    public int getField()
    {
        return field;
    }

    {
        field = 10;
    }

    public OrderOfInitialization()
    {
        field = 100;
    }

    public static void main(String[] args)
    {
        OrderOfInitialization o = new OrderOfInitialization();
        System.out.println(o.getField());
    }

}
