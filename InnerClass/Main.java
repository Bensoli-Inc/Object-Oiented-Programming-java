

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

        A.B obj1 = obj.new B();
        obj1.config();
    }
}