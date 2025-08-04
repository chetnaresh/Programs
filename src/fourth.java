import java.util.Arrays;

public class fourth {

    public static int countOutOfOrder(int[] actualOrder) {
        int[] expectedOrder = actualOrder.clone();
        Arrays.sort(expectedOrder);

        int count = 0;
        for (int i = 0; i < actualOrder.length; i++) {
            if (actualOrder[i] != expectedOrder[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] boardingOrder = {101, 103, 102, 104};
        System.out.println("Out of order passengers: " + countOutOfOrder(boardingOrder)); // Output: 2
    }
}
