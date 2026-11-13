import java.util.Scanner;
public class reversing_number {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum =0;
        while(n>0)
        {
            int last_digit = n%10;
            sum = sum*10 + last_digit;
            n=n/10;
        }
        System.out.println("Reversed number: " + sum);
    }
}
