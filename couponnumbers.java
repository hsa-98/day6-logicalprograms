import java.util.Random;
import java.util.Scanner;

public class couponnumbers {
    /*
    This function tells if a number already exists in the array.
     */
    public static boolean doesExist(int [] coupons,int num){
        for(int val:coupons){
            if(val==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println("Enter the number of coupons you want to generate");
        Scanner sc = new Scanner(System.in);
        int numOfCoupons = sc.nextInt();
        int [] coupons = new int[numOfCoupons]; //array to store coupons
        Random rand = new Random();
        int randNum,pos; //variables
        pos = randNum = 0; //will keep track of array position
        while(pos<numOfCoupons-1){
            int num = rand.nextInt(numOfCoupons);
            System.out.println(num);
            randNum++;
            if(!doesExist(coupons,num)){
                coupons[pos]=num;
                pos++;
            }

        }
        System.out.println(randNum+" Is the number of random numbers generated");
        for(int i=0;i<coupons.length;i++){
            System.out.print(coupons[i]+" ");
        }
    }
}
