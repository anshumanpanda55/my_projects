import java .util.Scanner;
public class niven_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int lastdigit = temp % 10;
            sum = sum+ lastdigit;
            temp= temp/10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Niven number.");
        } else {
            System.out.println(number + " is not a Niven number.");
        }
        sc.close();
    }
}