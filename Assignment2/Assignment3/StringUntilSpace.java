import java.util.Scanner;
public class StringUntilSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a string : ");
        String str = sc.nextLine();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') break;
            System.out.print(ch);
        }
        sc.close();
    }
}
