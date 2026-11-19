import java.util.Scanner;
public class methods {
    public static int reverse(int n)
    {
        int sum=0;
        while(n>0)
            {
                int r = n%10;
                sum=(sum*10)+r;
                n=n/10;
            }
return sum;
    }

    public static boolean prime(int n)
    {
        int i = 2;
        int flag=0;
        while(i<=n/2)
            {
if(n%i==0)
{
    flag=1;
    break;
}
i++;
            }
            if(flag==0){
        return true;
            }
            else{
                return false;
            }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int a=reverse(n);
    boolean b =prime(n);
    System.out.println(a);
    System.out.println(b);
}
}