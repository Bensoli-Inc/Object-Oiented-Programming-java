class Human 
{
    private int age = 11; //only accessible on this class
    private String name = "Ben";

    //data can be accessed by help of methods
    
    public int getAge() //GETTER
    {
        return age;
    }

    public String getName() //GETTER.
    {
        return name;
    }
}

public class Main
{
    public static void main(String[] a)
    {
        Human obj = new Human();

        // obj.age = 11;
        // obj.name = "Ben";

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}