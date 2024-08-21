
@Deprecated //u can use it but don't use it
class A 
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in A show");
    }
}

class B extends A
{   
    @Override //ANNOTATION - show your intentions to the complier
    public void showTheDataWhichBelongToThisClass() //spelling wrong
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