class Human 
{
    private int age; 
    private String name;
    
    public int setAge(int age) //SETTER
    {
        return this.age = age;
    }

    public String setName(String name) //SETTER
    {
         return this.name = name;
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