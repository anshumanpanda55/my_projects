import java.util.Scanner;
public class strong_number {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int temp1=n;
        int sum = 0;
        while(temp>0)
        {
            int r = temp%10;
            int product =1;
            for(int i=1;i<=r;i++)
            {
                product = product*i;
            }
            sum = sum + product;
            temp = temp/10;
        }
    
            if(sum==temp1)
            
            {
                System.out.println("The number is strong number");
            }
            else
            {
                System.out.println("The number is not strong number");
            }
        sc.close();

        
    }
}
    

