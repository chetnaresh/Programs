public class firstt {
    public static void main(String[] args) {
        int n = 123456789;
        String temp = "";

        while (n > 0) {
            int num = n % 10;
            temp += num;
            n = n / 10;
        }

        for (int i = 0; i < temp.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(temp.charAt(i));
            }
        }
    }
}
