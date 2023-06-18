package dataStructureExercises;

import dataStructures.stack.PalindromeExercise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Palindrome {
    @Test void testTruePalindromeEasy()
    {
        String text = "racecar";
        boolean palindromeResult = PalindromeExercise.isPalindrome(text);

        assertTrue(palindromeResult);
    }

    @Test void testTruePalindromeHard()
    {
        String text = "a man, a plan, a canal: Panama!";
        boolean palindromeResult = PalindromeExercise.isPalindrome(text);

        assertTrue(palindromeResult);
    }

    @Test void testFalsePalindrome()
    {
        String text = "This is not a palindrome!";
        boolean palindromeResult = PalindromeExercise.isPalindrome(text);

        assertFalse(palindromeResult);
    }
}
