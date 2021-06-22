import java.util.Scanner;

public class NewtonMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double num = sc.nextDouble();
        double epsilon = 0.00001;

        double sqrtOfNumber = sqrtUsingNewton(num, epsilon);
        System.out.println("The square root of the number is : " + sqrtOfNumber);

    }

    public static double sqrtUsingNewton(double c, double l) {

        double t = c;
        double root;

        //formula to calculate roots
        while (true) {

            root = 0.5 * (t + (c / t));

            if (Math.abs(root - t) < l)
                break;
            t = root;

        }

        return root;
    }
}
