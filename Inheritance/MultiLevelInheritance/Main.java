

public class Main
{
    public static void main(String[] a)
    {        
        VeryAdvCalc obj1 = new VeryAdvCalc();
        int sum1 = obj1.add(3,5);
        int diff1 = obj1.sub(8,3);
        int multi = obj1.multiply(3,5);
        int div = obj1.div(8,5);
        double pow = obj1.power(2,5);

        System.out.println("sum :" + sum1);
        System.out.println("Diff :" + diff1);
        System.out.println("Multiplication :" + multi);
        System.out.println("Qoutient :" + div);
        System.out.println("Power :" + pow);
    }
}