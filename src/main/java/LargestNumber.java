public class LargestNumber {
    public static void main(String[] args) {
        int num1=10, num2=20, num3=15;
        if(num1>=num2 && num1>=num3)
            System.out.println(num1+" is largest number");
        else if (num2>=num1 && num2>=num3)
            System.out.println(num2+" is largest number");
        else
            System.out.println(num3+" is largest number");
    }
}

