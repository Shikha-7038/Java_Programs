import java.util.Scanner;
public class DivisibleCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double n = sc.nextDouble();

        String result = (n % 3 == 0 && n % 5 == 0) ? "Divisible by 3 and 5" : "Not divisible";
        System.out.println(result);
        sc.close();
    }
}