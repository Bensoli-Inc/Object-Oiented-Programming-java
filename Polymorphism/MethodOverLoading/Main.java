class Calculator
{    //using same function name but each method accepts different no. of parameters or same parameters but of different types
    public int add(int n1, int n2)
    {
       return n1 + n2;
    }
    
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
     public double add(double n1, double n2)
    {
       return n1 + n2;
    }
    
}

public class Main
{
    public static void main(String[] a)
    {  
        Calculator obj = new Calculator();
        int r1 = obj.add(2, 3);
        System.out.println(r1);
    }
}