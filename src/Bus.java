import java.util.*;

public class Bus {
    public static void main(String[] args) {
        int[] preferredSeats = {3, 5, 12, 5, 11};
        Set<Integer> booked = new HashSet<>();
        int totalSeats = 40;
        int[] windowSeats = new int[10];
        for (int i = 0; i < 10; i++) windowSeats[i] = i + 1;

        for (int seat : preferredSeats) {
            if (seat < 1 || seat > totalSeats) continue;
            if (booked.contains(seat)) {
                System.out.println("Seat " + seat + " Already Booked");
            } else {
                booked.add(seat);
                System.out.println("Seat " + seat + " Booked");
            }
        }
    }
}
