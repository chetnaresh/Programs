import java.util.Arrays;

public class Airport {
    public static void main(String[] args) {
        int[] actual = {101, 103, 102, 104};
        int[] expected = actual.clone();
        Arrays.sort(expected);

        int count = 0;
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i]) count++;
        }
        System.out.println("Out of order passengers: " + count);
    }
}
