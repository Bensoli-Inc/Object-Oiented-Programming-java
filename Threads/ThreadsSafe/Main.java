
class Counter
{
    int count;
    public synchronized void increment() //synchronized makes the increment method to be called only once at a time
    {
        count++;
    }
}

public class Main 
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter c = new Counter();

        Runnable obj = () ->
            {
                for(int i = 0;i<1000;i++)
                {
                    c.increment();
                }
            };

        Runnable obj2 = () ->
            {
                for(int i=0;i<1000;i++)
                {
                   c.increment();
                }
            };

       Thread t1 = new Thread(obj);
       Thread t2 = new Thread(obj2);
        t1.start();     
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}