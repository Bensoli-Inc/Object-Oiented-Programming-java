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
        int i = 0;
        int j = 0;
        try
        {
            j=18/i;
        }
        catch(Exception e) //Exception is a class in java
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");

    }
}