import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        System.out.println("Enter two numbers for division");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
       int number2 = scan.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("Quotient value: "+quotient);
        System.out.println("Remainder value: "+remainder);
    }

}

