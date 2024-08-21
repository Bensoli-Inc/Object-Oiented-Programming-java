

class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}


public class Main
{
    public static void main(String[] a)
    {
        A obj = new A()
        {
            public void show() //innerclass -no name for it -anonymous
            {
                System.out.println("In New Show");
            }
        };
        obj.show();

    
    }
}