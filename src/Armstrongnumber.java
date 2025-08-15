import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        int temp=n;
        int sum=0;
        while(n!=0){
            n=n/10;
            count++;
        }

        if(sum==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
