
//class - class -> extends
//class - interface -> impliments
//interface - interface -> extends

interface A 
{
    
    void config();

    int age = 22;
    String area = "Juja";
}

interface X 
{
    void run();
}

interface Y extends X //USE EXTENDS IF INHERITING INTERFACE FROM INTERFACE
{
    
}

class B implements A,X //1 class implementing multiple interfaces
{
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
    }

    public void run()
    {
        System.out.println("in run");
    }
}

public class Main
{
    public static void main(String[] a)
    {
       B obj;
       obj = new B();
       obj.show();
       obj.config();
       obj.run();

       System.out.println(A.area);
    }
}