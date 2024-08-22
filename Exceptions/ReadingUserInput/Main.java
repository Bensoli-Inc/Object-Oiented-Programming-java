import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] a)
    {
        // System.out.println("Enter a number");
        
        // try {
        //     int num = System.in.read();  //has exception
        //     System.out.println("Number is : " + (num - 48));
        // } catch(Exception e)
        // {
        //     System.out.println("nothing serious");
        // }


        // System.out.println("Enter a number");
        
        // try {
            
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     BufferedReader bf = new BufferedReader(in);

        //     int num = Integer.parseInt(bf.readLine());
        //     System.out.println("Number is : " + (num));

        //     bf.close();
        // } catch(Exception e)
        // {
        //     System.out.println("nothing serious");
        // }

          System.out.println("Enter a number");
        
        try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Number is : " + (num));
        } catch(Exception e)
        {
            System.out.println("nothing serious");
        }
        
    }
}