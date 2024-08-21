
enum Status{
    Running, Failed, Pending, Success;
}

public class Main
{
    public static void main(String[] a)
    {
        Status s = Status.Running;
        System.out.println(s);
    }
}