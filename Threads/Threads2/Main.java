class Z 
{

}

class A implements Runnable //making A clid of Z class and child of Threads at once
{
    public void run()
    {
        for(int i = 0; i<5;i++)
        {
            System.out.println("Hi");
            try{
                Thread.sleep(10); //telling the thread to wait
            } 
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable
{
    public void run() 
    {
        for(int i = 0; i<5;i++)
        {
            System.out.println("Hello");
            try{
                Thread.sleep(10); //telling the thread to wait
            } 
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main 
{
    public static void main(String[] a)
    {
        Runnable obj = new A();
        Runnable obj2 = new B();

       Thread t1 = new Thread(obj);
       Thread t2 = new Thread(obj2);
        t1.start();     
        t2.start();
    }
}