 
 @FunctionalInterface 
interface A
{
    int add(int a,int b);
}

public class Main
{
    public static void main(String[] a)
    {
        //lampda expressions only work wth functional interfaces
        A obj = (x,y) -> x+y; //lampda expression - removed curli brackets and the new keyword and public void statements
        int result = obj.add(6,7);
        
        System.out.println(result);
    }
}