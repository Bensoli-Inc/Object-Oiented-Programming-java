import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        // int i =2;
        // int j =0;
        // try
        // {
        //     j = 18/i;
        
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Something went wrong.");
        // }
        // finally 
        // { //will execute this block irrespective of exception or not
        //     System.out.println("Bye");
        // }

        int num = 0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
           System.out.println("Enter a number: ");
           
           num = Integer.parseInt(br.readLine());
           System.out.println("Number is: " + num);
        }
        
    }
}