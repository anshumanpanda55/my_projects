import java.util.Scanner;
public class niven_numbers_between_range {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int x = sc.nextInt();
        System.out.println("Enter the upper limit:");
        int y = sc.nextInt();
        int count = 0 ;
        for (int i=x;i<=y;i++)
        {
            int sum = 0 ;
            int temp=i;
            int n=i;
            while(temp!=0)
            {
                int lastdigit = temp%10;
                sum = sum + lastdigit;
                temp=temp/10;
            }
            if(n%sum==0)
            {
                count++;
            }
        }
     System.out.println("The numbers of niven numbers between "+x+" and "+y+" is: "+count);

    
    }

}
