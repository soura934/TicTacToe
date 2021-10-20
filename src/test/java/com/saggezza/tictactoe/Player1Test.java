package com.saggezza.tictactoe;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class Player1Test {

    @Test
    public void inputValidationCallOnce() {
        //Given: it is player 1 turn
        // And: grid size is 3
        // And: player 1 enter [2, 0]
        int[] pos = {2, 0};
        String[][] grid =  {
                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}
        };
        IInputValidation inputValidation = mock(IInputValidation.class);
        when(inputValidation.validate(pos, 3)).thenReturn(true);

        //When: I need to validate the input
        IPlayer1 player1 = new Player1(inputValidation);
        player1.mark(pos, grid);

        //Then: I call input validation once
        verify(inputValidation, times(1)).validate(pos, 3);
    }
}
