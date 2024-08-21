
enum Laptop{
    Macbook(2000), Lenovo(1600), Dell(1800), Hp(1400); //the enums have become objects of class Laptop because i am passing values

    private int price;

    private Laptop(int price) //construcctor of enum Laptop
    {
        this.price = price;
    }

    //create getter to access price
    public int getPrice()
    {
        return price;
    }

    //setter
    public int setPrice(int price)
    {
        return this.price = price;
    }
}

public class Main
{
    public static void main(String[] a)
    {
       Laptop lap = Laptop.Macbook;
       System.out.println(lap + " : " + lap.getPrice());

       //to get all laptops
       for(Laptop lapp : Laptop.values())
       {
            System.out.println(lapp + " : " + lapp.getPrice());
       }
    }
}