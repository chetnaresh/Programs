import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        StringBuilder result = new StringBuilder();

        // Traverse from the end to reverse
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                if (digit % 2 != 0) { // odd digit
                    result.append(digit);
                }
            }
        }

        System.out.println("Output: " + result.toString());
    }
}
