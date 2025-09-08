import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate Of Interest : ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years) : ");
        double time = sc.nextDouble();
        
        double si = (principal * rate * time);
        System.out.print("Simple Interest : "+ si);

        sc.close();

    }
}
