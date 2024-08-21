//final can be used with - variable, method, class


class Calc
{
    public final void show()
    {
        System.out.println("By Ben");
    }

     public void add(int a, int b)
    {
       System.out.println(a+b);
    }
}


class AdvCalc extends Calc 
{
    public void show() // error - show() in AdvCalc cannot override show() in Calc
    {
        System.out.println("By Alex");
    }

}


public class Main
{
    public static void main(String[] a)
    {
       
        Calc obj = new Calc();
        obj.show();
        obj.add(5,8);
    } 
}