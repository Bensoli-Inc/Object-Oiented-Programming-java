class Human 
{
    private int age; 
    private String name;
    
    public int setAge(int a) //SETTER
    {
        return age = a;
    }

    public String setName(String n) //SETTER
    {
         return name = n;
    }

    public int getAge() //GETTER
    {
         return age;
    }

    public String getName() //GETTER
    {
        return name;
    }
}

public class Main
{
    public static void main(String[] a)
    {
        Human obj = new Human();

        obj.setAge(23);  //setting a value
        obj.setName("Ben");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}