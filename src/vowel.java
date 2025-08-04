public class vowel {
    public static void main(String[] args) {
        String input = "abide";
        System.out.println(isValid(input) ? "Valid" : "Invalid");
    }

    static boolean isValid(String word) {
        if (word.length() < 3) return false;
        String vowels = "aeiouAEIOU";
        if (!vowels.contains("" + word.charAt(0)) || !vowels.contains("" + word.charAt(word.length() - 1)))
            return false;

        int count = 0;
        for (int i = 1; i < word.length() - 1; i++) {
            if (vowels.contains("" + word.charAt(i))) count++;
        }

        return count == 2;
    }
}
