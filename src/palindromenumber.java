import java.util.Scanner;

public class palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int rev=0;
        int temp=n;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
