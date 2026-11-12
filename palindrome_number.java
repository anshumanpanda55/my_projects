import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;

        while (n > 0) {
            int last_digit = n % 10;
            sum = sum * 10 + last_digit;
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }

        sc.close();
    }
}
