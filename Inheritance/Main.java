

public class Main
{
    public static void main(String[] a)
    {
        Calc obj = new Calc();
        int sum = obj.add(3,5);
        int diff = obj.sub(8,3);

        // System.out.println("sum :" + sum);
        // System.out.println("Diff :" + diff);

        
        AdvancedCalc obj1 = new AdvancedCalc();
        int sum1 = obj1.add(3,5);
        int diff1 = obj1.sub(8,3);
        int multi = obj1.multiply(3,5);
        int div = obj1.div(8,5);

        System.out.println("sum :" + sum1);
        System.out.println("Diff :" + diff1);
        System.out.println("Multiplication :" + multi);
        System.out.println("Qoutient :" + div);

    }
}