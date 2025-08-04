import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPattern = 1234;
        int attempts = 5;

        while (attempts-- > 0) {
            System.out.print("Enter pattern: ");
            int input = sc.nextInt();

            if (input == correctPattern) {
                System.out.println("Success!");
                return;
            }
        }
        System.out.println("System Locked.");
    }
}
