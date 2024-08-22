//create a class to handle your own exceptions

class BenException extends Exception
{
    public BenException(String str)
    {
        super(str);
    }
}

public class Main
{
    public static void main(String[] args)
    {
       
        int i = 20;
        int j = 0;

        try
        {
            j=18/i;
            if(j==0)
                throw new BenException("I cannot print zero");
        }
        catch(BenException e) 
        {
            j = 18/1;
            System.out.println("thats the default output " + e);
        }
        catch(Exception e)
        {

            System.out.println("Something went wrong. " + e);
        }

        System.out.println(j);
    }
}