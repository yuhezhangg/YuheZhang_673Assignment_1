//This is the Problem 4 of CS673 Assignment 1
//Name: Yuhe Zhang
public class PalindromeString {
    public boolean checkPalindrome(String s) {
        String reverseStr = "";
        for (int i = (s.length() - 1); i >= 0; i--) {
            reverseStr = reverseStr + s.charAt(i);
        }
        return s.equals(reverseStr);
    }
}
