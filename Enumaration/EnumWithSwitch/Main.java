
enum Status{
    Running, Failed, Pending, Success; //named constants
}

public class Main
{
    public static void main(String[] a)
    {
        Status s = Status.Pending;

        if(s == Status.Running)
            System.out.println("All GOOD");
        else if(s == Status.Failed)
            System.out.println("Try Again");
        else if(s == Status.Pending)
            System.out.println("Please wait");
        else 
            System.out.println("Done");

        Status x = Status.Success;
    
        switch(x)
        {
            case Running:
                System.out.println("All GOOD");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}