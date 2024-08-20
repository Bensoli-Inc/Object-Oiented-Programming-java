 class A
{
    public void show()
    {
        System.out.println("in A show");
    }

    public void config()
    {
        System.out.println("in A config");
    }
}

 class B extends A
{
    public void show() //overwrites the show() of parent class
    {
        System.out.println("in show");
    }
}

public class Main
{
    public static void main(String[] a)
    {
        B obj = new B();
        obj.show();
        obj.config();
    }
}