public class Swap
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swapping numbers:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
