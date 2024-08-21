
abstract class Car // since it has an abstract method
{
    public abstract void drive(); ///declaring a method and not implemtning it

    public void playMusic()
    {
        System.out.println("playing music...");
    }
}

class Wagon extends Car //concrete class
{
    public void drive() //implementing the method -must
    {
        System.out.println("Driving...");
    }
}

public class Main
{
    public static void main(String[] a)
    {
        // Car obj = new Car(); -cannot cretae an object of an abstract class
        Car obj = new Wagon();
        obj.drive();
        obj.playMusic();
    }
}