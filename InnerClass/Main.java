

class A
{
    int age;

    public void show()
    {
        System.out.println("In Show");
    }

    class B
    {
        public void config()
        {
            System.out.println("In config");
        }
    }
}

public class Main
{
    public static void main(String[] a)
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B(); //specify that B belongs to A. then u need an object of outer class (obj) to create an object of inner class 
        obj1.config();
    }
}