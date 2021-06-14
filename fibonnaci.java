import java.util.Scanner;

public class fibonnaci {
    public static void main(String args[]){
        System.out.println("Enter the number of fibonacci numbers you want");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<num-2;i++){
            int c = b;
            b=a+b;
            a=c;
            System.out.println(b);

        }


    }
}
