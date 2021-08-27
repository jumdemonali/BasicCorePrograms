import java.util.Scanner;

public class Factor {
    // TODO Auto-generated method stub
    static Factor obj = new Factor();

    public static void main(String[] args) {
        boolean prime = obj.isPrime(33);
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        obj.primeFactor(n);
    }

    boolean isPrime(int n) {
        int count = 0;
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            flag = true;
            return flag;
        } else
            return flag;
    }

    void primeFactor(int n) {
        int i = 2;
        while (n > 1) {
            if (n % i == 0 && obj.isPrime(i) == true) {
                System.out.println(i);
                n = n / i;
            } else
                i = i + 1;
        }
    }
}
