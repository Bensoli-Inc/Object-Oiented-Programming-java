//final can be used with - variable, method, class

public class Main
{
    public static void main(String[] a)
    {
        final int num = 8;
        num = 9; //error - annot assign a value to final variable num

        System.out.println(num);
    } 
}