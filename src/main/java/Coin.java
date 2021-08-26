import java.util.Scanner;

public class Coin
{
    public static void main(String[] args) {
        int headcount = 0, tailcount = 0;
        double heads, tails;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of times you wish to flip the coin: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random < 0.5)
                tailcount++;
            else
                headcount++;
        }

        heads = headcount / (double) n * 100;
        tails = tailcount / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");
    }

}
