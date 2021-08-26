import java.util.Scanner;
public class Harmonic
{
    public static double harmonic(double num)
    {
        double value = 0.0;

        for (int i = 1; i <= num; i++)
        {
            value = value + (1.0/i);
        }
        return value;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num=scan.nextDouble();
        double r=harmonic(num);
        if(num>0)
        {
            System.out.println("Harmonic value of number is: "+r);
        }
        else
        {
            System.out.println("The number should be greater than zero");
        }
    }
}
