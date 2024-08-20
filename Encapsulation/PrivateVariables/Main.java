class Human 
{
    private int age; //only accessible on this class
    String name;
}

public class Main
{
    public static void main(String[] a)
    {
        Human obj = new Human();

        obj.age = 11;
        obj.name = "Ben";

        System.out.println(obj.age); //error
    }
}