//class loads once (the static block is initiated), objects are instantiated

class Mobile
{
    String brand;
    int price;
    static String name;

    //static block
    static
    {
        name = "phone";
        System.out.println("static block called...");
    }
    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("constructors called...");
    }
    public void show()
    {
        System.out.println(brand + ": " + price + " : " + name);
    }
}

public class Main 
{
    public static void main(String[] a)
    {
    
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; 
        
        Mobile obj2 = new Mobile();

         //how to load a class without creating an object
        Class.Forname("Mobile"); // a class called Class in java
    }
}