//used to instantiate a class
class Mobile
{
    String brand;
    int price;
    Static String name;

    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("constructor called...")
    }
    static
    {
        name = "phone";
        System.out.println("static block called...")
       
    }
    public void show()
    {
        System.out.println(brand + ": " + price + " : " + name)
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
    }
}