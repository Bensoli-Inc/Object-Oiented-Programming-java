class Laptop
{
     String model;
     int price;

     public String toString()
     {
        return model + " : " + price;
     }
}

public class Main
{
    public static void main(String[] a)
    {
        Laptop obj = new Laptop();
        obj.model = "Lenovo";
        obj.price = 1000;

        System.out.println(obj.toString()); //weird output -it calls tostring method by defualt
    }
}