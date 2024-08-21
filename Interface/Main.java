// abstract class Computer
interface Computer
{
    // public abstract void code();
    void code();
}

// class Laptop extends Computer
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run: Faster");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class Main
{
    public static void main(String[] a)
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer Bensoli = new Developer();
        Bensoli.devApp(desk);
    }
}