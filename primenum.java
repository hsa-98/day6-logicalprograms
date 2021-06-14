import java.util.Scanner;

public class primenum {
    public static void prime(int num){
        if(num == 0 || num == 1){
            System.out.println(num+" Is not prime");
        }
        int flag = 0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i == 0){
                System.out.println(num+" Is not prime");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(num+" Is prime");
        }

    }
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        prime(number);
    }
}
