//these are runtime errors

//other types of errors are 
//compile-time errors
//logical errors

public class Main
{
    public static void main(String[] args)
    {
        // int i = 0; //normal statement
        // int j = 18/i; //critical statement - arithmetic exception - execution stopped

        //HANDLING THE EXCEPTION
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;
        try
        {
            j=18/i;
            System.out.println(nums[3]); //out of bounds exception
            System.out.println(str.length());
        }
        catch(ArithmeticException e) //Exception is a class in java
        {
            System.out.println("Cannot divide by zero. " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your array limit. " + e);
        }
        catch(Exception e)
        {

            System.out.println("Something went wrong. " + e);
        }

        System.out.println(j);
    }
}