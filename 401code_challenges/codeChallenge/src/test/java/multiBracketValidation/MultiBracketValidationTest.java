package multiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void canTestOnePairBrackets() {
        assertTrue("This is a correct pair of brackets",MultiBracketValidation.multiBracketValidation("{}"));
    }


    @Test
    public void canTestThreePairsBrackets() {
        assertTrue("These are correct pairs of brackets",MultiBracketValidation.multiBracketValidation("{}(){}"));
    }

    @Test
    public void canTestLettersInsideBrackets() {
        assertTrue("These are correct pairs of brackets",MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
    }


    @Test
    public void canTestMultipleWordsInsideBrackets() {
        assertTrue("These are correct pairs of brackets",MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
    }


    @Test
    public void canTestNotPairedBrackets() {
        assertFalse("These are Not  correct pairs of brackets",MultiBracketValidation.multiBracketValidation("[({}]"));
    }


    @Test
    public  void canTestLeftBracketsMorethanRightBrackets(){
        assertFalse("These are Not  correct pairs of brackets",MultiBracketValidation.multiBracketValidation("(]("));
    }


    @Test
    public  void canTestNotcorrectlyPairedBrackets(){
        assertFalse("These are Not  correct pairs of brackets",MultiBracketValidation.multiBracketValidation("{(})"));
    }



}