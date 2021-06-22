import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int number = sc.nextInt();

        System.out.println("The number " + number + " in binary form is : ");
        decimalToBinaryConverter(number);

    }

    //calculates a binary value of the decimal number given as input
    public static void decimalToBinaryConverter(int n) {

        StringBuffer sb = new StringBuffer();

        while (n != 0) {

            int remainder = n % 2;
            n = n / 2;
            sb.append(remainder);

        }

        System.out.println(sb.reverse());

    }
}
