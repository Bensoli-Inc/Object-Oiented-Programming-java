sealed class A permits B,C
{

}

non-sealed class B extends A
{
    
}

sealed class C extends A permits D
{
    
}

final class D extends C//not allowed to inherit A
{
    
}

final class E extends B
{

}

public class Main
{
    public static void main(String[] a)
    {

    }
}