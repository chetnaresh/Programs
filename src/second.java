public class second {

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static String isValidPuzzleWord(String word) {
        if (word.length() < 3)
            return "Invalid";

        if (!isVowel(word.charAt(0)) || !isVowel(word.charAt(word.length() - 1)))
            return "Invalid";

        int vowelCount = 0;
        for (int i = 1; i < word.length() - 1; i++) {
            if (isVowel(word.charAt(i))) {
                vowelCount++;
            }
        }

        return vowelCount == 2 ? "Valid" : "Invalid";
    }

    public static void main(String[] args) {
        System.out.println(isValidPuzzleWord("abide"));  // Output: Valid
        System.out.println(isValidPuzzleWord("aim"));    // Output: Invalid
    }
}
