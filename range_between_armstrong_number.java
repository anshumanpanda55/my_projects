import java.util.Scanner;
public class range_between_armstrong_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int x = sc.nextInt();
        System.out.println("Enter the upper limit:");
        int y = sc.nextInt();
        int count = 0;
        for(int i=x; i<=y; i++)
        {
            int k=0;
            int temp=i;
            while(temp>0)
            {
                temp=temp/10;
                k++;
            }
                int n=i;
                int sum=0;
                while(n>0)
                {
                    int r = n%10;
                    sum= sum + (int)Math.pow(r,k);
                    n=n/10;
                }
            if(sum==i)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("The numbers of armstrong numbers between "+x+" and "+y+" is: "+count);
        

    }
    
}
