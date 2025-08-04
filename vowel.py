def is_valid_puzzle_word(word):
    vowels = 'aeiouAEIOU'
    if len(word) < 3:
        return "Invalid"  # Not enough letters to have 2 inside vowels

    if word[0] in vowels and word[-1] in vowels:
        # Count vowels excluding first and last
        inside_vowels = sum(1 for ch in word[1:-1] if ch in vowels)
        return "Valid" if inside_vowels == 2 else "Invalid"
    return "Invalid"

# Example
print(is_valid_puzzle_word("abide"))  # Output: Valid
