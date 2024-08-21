//final can be used with - variable, method, class


final class Calc
{
    public void show()
    {
        System.out.println("In calc show");
    }

     public void add(int a, int b)
    {
       System.out.println(a+b);
    }
}


class AdvCalc extends Calc
{


}


public class Main
{
    public static void main(String[] a)
    {
        //error - annot assign a value to final variable num
        Calc obj = new Calc();
        obj.show();
        obj.add(5,8);
    } 
}