
class A 
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Mainn");
    }
}

public class Main 
{
    public static void main (String[] a)
    {
        A obj = new A();
        try{
            obj.show ();
        } catch(ClassNotFoundException e)
        {
            System.out.println("class not found " + e);
        }
    }
}