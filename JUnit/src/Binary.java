import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        // range of unsigned byte is from 0 to 255
        int RANGE = 255;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the decimal number between 0 to 255: ");
        int number = sc.nextInt();

        if (number >= 0 && number <= RANGE) {

            System.out.println("The value of " + number + " in binary form is : ");
            decimalToBinaryConverter(number);

        } else
            System.out.println("INVALID INPUT !!! Please enter number between 0 to 255");

    }
    public static void decimalToBinaryConverter(int n) {

        StringBuffer sb = new StringBuffer();

        while (n != 0) {

            int remainder = n % 2;
            n = n / 2;
            sb.append(remainder);

        }

        System.out.println(sb.reverse());
        binaryToDecimalConverter(sb);
    }

        public static void binaryToDecimalConverter(StringBuffer sb) {

        if (sb.length() < 8) {
            while (sb.length() != 8)
                sb.insert(0, 0);
        }
        System.out.println("Binary Number of 8 bits is : " + sb);

        String s1 = sb.substring(0, 4);
        String s2 = sb.substring(4);
        String s3 = s2 + s1;
        System.out.println("The value of binary number after swapping the nibbles is : " + s3);


        int decimalToBinary = Integer.parseInt(s3, 2);
        System.out.println("The decimal number after swapping nibbles is : " + decimalToBinary);

    }
}
