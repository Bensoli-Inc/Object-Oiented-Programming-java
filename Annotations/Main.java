
class A 
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void showTheDataWhichBelongToThisClass()
    {
        System.out.println("in B show");
    }
}

public class Main 
{
    public static void main(String[] a)
    {
        B obj =  new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}