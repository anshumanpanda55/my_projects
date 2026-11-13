import java.util.Scanner;
public class armstrong_number {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int n = sc .nextInt();
        int t = n;
        int p = n;
        int k = 0;
        while(t>0)
        {
            k++;
            t=t/10;
        }
    int sum = 0;
    while(p>0)
    {
        int lastdigit = p%10;
        sum = sum + (int)Math.pow(lastdigit,k);
        p=p/10;
    }
    if(sum == n)
    {
        System.out.println(n+" is an Armstrong number.");
    }
    else
    {
        System.out.println(n+" is not an Armstrong number.");
    }
    }
    
}
