///threads is the smallest unit of a running 

class A extends Thread
{
    public void run()
    {
        for(int i = 0; i<50;i++)
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

class B extends Thread
{
    public void run() //run method to be called by start
    {
        for(int i = 0; i<50;i++)
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
        A obj = new A();
        B obj2 = new B();

        //THREADS PRIORITY
        System.out.println(obj2.getPriority()); //(range from 1-10)
        obj2.setPriority(Thread.MAX_PRIORITY-2);
        obj.start(); //using start method to run the method as a thread
                try{
                Thread.sleep(2); 
            } catch(InterruptedException e) { e.printStackTrace();}
        obj2.start();
    }
}