import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number : ");
        int n = sc.nextInt(), rev = 0, temp = n;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if (rev == temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}
