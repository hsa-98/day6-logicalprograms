import java.util.Scanner;

public class reversenum {
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int ans =0;
        while(num>0){
            ans=ans*10+num%10;
            num=num/10;
        }
        System.out.println(ans);
    }
}
