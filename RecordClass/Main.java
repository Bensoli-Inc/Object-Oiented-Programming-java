record Alien(int id, String name) {} //declared class with variables and constructors at once

public class Main
{
    public static void main(String[] args)
    {
        Alien a1 = new Alien(3, "peter"); //immutable. created just to crarry data
        System.out.println(a1);
    }
}