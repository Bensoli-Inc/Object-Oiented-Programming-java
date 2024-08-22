
public class Main 
{
    public static void main(String[] a)
    {
        Runnable obj = () ->
            {
                for(int i = 0; i<5;i++)
                {
                    System.out.println("Hi");
                    try{ Thread.sleep(10); } catch(InterruptedException e) {e.printStackTrace();}
                }
            };

        Runnable obj2 = () ->
            {
                for(int i = 0; i<5;i++)
                {
                    System.out.println("Hello");
                    try{ Thread.sleep(10); } catch(InterruptedException e) {e.printStackTrace();}
                }
            };

       Thread t1 = new Thread(obj);
       Thread t2 = new Thread(obj2);
        t1.start();     
        t2.start();
    }
}