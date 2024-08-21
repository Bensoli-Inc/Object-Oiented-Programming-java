interface A 
{
    // public abstract void show(); --no need tomention public abstract
    // public abstract void config();
    void show();
    void config();

//all variables in interface are final and static- must assign
    int age = 22;
    String area = "Juja";
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
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

       System.out.println(A.area);
       A.area = "NAIROBI"; //error - cannot assign a value to static final variable area
    }
}