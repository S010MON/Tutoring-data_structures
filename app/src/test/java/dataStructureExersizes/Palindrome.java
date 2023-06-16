package dataStructureExersizes;

import dataStructures.stack.PalindromeExersize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Palindrome {
    @Test void testTruePalindromeEasy()
    {
        String text = "racecar";
        boolean palindromeResult = PalindromeExersize.isPalindrome(text);

        assertTrue(palindromeResult);
    }

    @Test void testTruePalindromeHard()
    {
        String text = "a man, a plan, a canal: Panama!";
        boolean palindromeResult = PalindromeExersize.isPalindrome(text);

        assertTrue(palindromeResult);
    }

    @Test void testFalsePalindrome()
    {
        String text = "This is not a palindrome!";
        boolean palindromeResult = PalindromeExersize.isPalindrome(text);

        assertFalse(palindromeResult);
    }
}
