
//an object/class should have methods(functions) 
                        //and properties(variables)

class Calculator
{
    int a; //property

    public int sum(int n1, int n2) //method
    {
        int r = n1 + n2;
        return r;
    }
}


public class Main 
{
    public static void main(String[] a) 
    {
        int num1 = 3;
        int num2 = 4;

        Calculator calc = new Calculator(); //creating a new object of type(classname) new keyword to consume space
        int result = calc.sum(num1,num2);

        System.out.println(result);
    }
}