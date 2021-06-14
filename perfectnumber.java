import java.util.Scanner;

public class perfectnumber {
    public static void perfectnumber(int number){
        int answer=0;
        for(int i=1; i<=number/2+1;i++){
            if(number%i==0){
                answer+=i;
            }
        }
        if(number == answer){
            System.out.println(number+"is a perfect number");
        }
        else{
            System.out.println(number+"is not a perfect number");
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        perfectnumber(num);

    }
}
