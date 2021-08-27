 import java.util.Scanner;

    public class Power {

        public static void main(String[] args)
        {
            System.out.println("Enter a number:");
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            for(int i=1;i<=number;i++)
            {
                System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));
            }
        }

    }
