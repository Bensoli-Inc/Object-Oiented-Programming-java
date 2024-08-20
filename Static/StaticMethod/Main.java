
class Mobile
{
    String brand;
    int price;
    static String name; 

    
    public void show()
    {
        System.out.println(brand + ": " + price + " : " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + ": " + obj.price + " : " + name);
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
        
        obj1.show();
        obj2.show();

        Mobile.show1(obj1); //u can call static methods with help of classname
    }
}