
class Human 
{
    private int age; 
    private String name;
    
    public Human() //default CONSTRUCTOR -same name as class name
    {
        age = 20;
        name = "ben";
    }

    public Human(int a, String n) //parametrized CONSTRUCTOR -same name as class name
    {
        age = a;
        name = n;
    }

    public int setAge(int age) 
    {
        return this.age = age;
    }

    public String setName(String name) 
    {
         return this.name = name;
    }

    public int getAge() 
    {
         return age;
    }

    public String getName() 
    {
        return name;
    }
}

public class Main
{
    public static void main(String[] a)
    {
        Human obj = new Human(); //constructor wil be called after creating a new class
        Human obj1 = new Human(18, "kate"); //will call the parametrized constructor
        // obj.setAge(23);  //setting a value
        // obj.setName("Ben");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}