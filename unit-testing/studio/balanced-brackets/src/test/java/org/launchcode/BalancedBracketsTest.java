package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


//    TODO: input = [Signora]
    @Test
    public void stringInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Signora]"));
    }

    @Test
    public void multipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Signora] [Neroni] [the cat]"));
    }

//    TODO: input = [Signora
    //    TODO: input = Signora]

    @Test
    public void bracketsOnPartOfStringReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Signora] Neroni"));
    }

    @Test
    public void oneBracketReturnsFalse() {
        String msg1 = "Bracket at start of string";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Signora"), msg1);

        String msg2 = "Bracket at end of string";
        assertFalse(BalancedBrackets.hasBalancedBrackets("Signora]"));

        String msg3 = "Bracket in middle of string";
        assertFalse(BalancedBrackets.hasBalancedBrackets("Sign]ora"));
    }

    @Test
    public void multipleImbalancedBracketsReturnsFalse() {
        String msg1 = "Two opening brackets at start of string";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Signora"), msg1);

        String msg2 = "Two opening brackets at end of string";
        assertFalse(BalancedBrackets.hasBalancedBrackets("Signora[["), msg2);

        String msg3 = "Brackets in middle of string facing wrong way";
        assertFalse(BalancedBrackets.hasBalancedBrackets("Sign][ora"), msg3);
    }

    @Test
    public void insideOutBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Signora["));
    }

    @Test
    public void endsOnOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Signora] ["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Signora["));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }


}