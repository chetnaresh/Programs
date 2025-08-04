import java.util.Arrays;

public class Student_rank {
    public static void main(String[] args) {
        Integer[] marks = {50, 80, 60};
        Arrays.sort(marks, (a, b) -> b - a);

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + ". " + marks[i]);
        }
    }
}
