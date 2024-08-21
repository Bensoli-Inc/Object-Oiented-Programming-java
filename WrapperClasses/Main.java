

public class Main 
{
    public static void main(String[] a)
    {
        int num =7;
        Integer num1 = new Integer(8); //  warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
        Integer num2 = 8; //correct way
        Integer num3 = num; //autoboxing

        int num4 = num1.intValue(); //unboxing
        int num5 = num1; //auto unboxing
        System.out.println(num1);

        String str = "12";
        int n1 = Integer.parseInt(str);
        System.out.println(n1*2);
    }
}