class Computer
{

}

class Laptop extends Computer
{

}


class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("in C show");
    }
}

public class Main
{
    public static void main(String[] a)
    {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        Computer obj1 = new Laptop(); //creating a refrence of superclass and an object of subclass
    }
}