import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeStringTest {

    private PalindromeString palindromeString = new PalindromeString();

    @Test
    void truePalindrome() {
        String trueString = "ooo";
        boolean result = palindromeString.checkPalindrome(trueString);
        assertEquals(true, result);
    }

    @Test
    void falsePalindrome() {
        String falseString = "opps";
        boolean result = palindromeString.checkPalindrome(falseString);
        assertEquals(false, result);
    }
}