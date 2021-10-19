package com.saggezza.tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

public class InputValidationTest {

    @Test
    public void positionValidTest() {
//      Given: the size of my grid is 3 by 3
        int userInput = 3;
        int[] pos = {0,1};

//      When: I pass in 0,1
        IInputValidation inputValidation = new InputValidation();

//      Then: I should return true
        assertTrue(inputValidation.validate(pos, userInput));
    }

    @Test
    public void positionNotValidTest() {
//      Given: the size of my grid is 3 by 3
        int userInput = 3;
        int[] pos = {0,3};

//      When: I pass in 0,1
        IInputValidation inputValidation = new InputValidation();

//      Then: I should return true
        assertFalse(inputValidation.validate(pos, userInput));
    }
}
