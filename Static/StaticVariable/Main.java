//Making something as a class Member not object Member

class Mobile
{
    String brand;
    int price;
    static String name; //this name variable is now common to all objects

    
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
        Mobile.name = "SmartPhone"; // we can access the property name directly without calling any object by just calling the class
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 2000;
        Mobile.name = "SmartPhone";
        
        obj1.name = "iphone" //will change name for all objects
        obj1.show();
        obj2.show();
    }
}