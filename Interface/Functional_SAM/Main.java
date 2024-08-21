 
 @FunctionalInterface // annotaion to show its a functional interface- has only 1 method
interface A
{
    void show();
}

// class B implements A 
// {
//     public void show() 
//     {
//         System.out.println("In show");
//     }
// }

public class Main
{
    public static void main(String[] a)
    {
    //    A obj = new A()
    //    {
    //          public void show() 
    //         {
    //             System.out.println("In show");
    //         }
    //    };

    A obj = () -> //lamba expression
            {
                System.out.println("In show");
            }
       ;
       obj.show();
    }
}