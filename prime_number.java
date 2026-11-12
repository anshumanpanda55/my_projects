import java.util.Scanner;
public class prime_number{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i = 2;
        int c = 0;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                c=1;
                break;
            }
            i++;
        }
        if(c==0)
        {
            System.out.println("The number is prime number");
        }
        else
        {
            System.out.println("The number is not prime");
            sc.close();
        }
    }
    
}
