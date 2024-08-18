class Computer
{
    public void playMusic()
    {
       System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
            return "Pen";
       
        return "Nothing";
    }
}

public class Main
{
    public static void main(String[] a)
    {   
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(3);
        System.out.println(str);
    }
}