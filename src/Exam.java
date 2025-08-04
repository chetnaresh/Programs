public class Exam {
    public static void main(String[] args) {
        int[] ids = {21, 34, 43, 52};

        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] % 10 == ids[i + 1] % 10) {
                System.out.println("Invalid - " + ids[i] + " and " + ids[i + 1] + " have same last digit");
                return;
            }
        }
        System.out.println("Valid");
    }
}
