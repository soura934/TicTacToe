package com.saggezza.tictactoe;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class Player2Test {

    @Test
    public void inputValidationOnce() {
        //Given: it is player 1 turn
        // And: grid size is 3
        // And: player 2 enter [2, 0]
        int[] pos = {2, 0};
        String[][] grid =  {
                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}
        };
        IInputValidation inputValidation = mock(IInputValidation.class);
        when(inputValidation.validate(pos, 3)).thenReturn(true);

        IEmptyPos emptyPos = mock(IEmptyPos.class);
        when(emptyPos.isEmpty(pos,grid)).thenReturn(true);

        //When: I need to validate the input
        IPlayer2 player2 = new Player2(inputValidation, emptyPos);
        player2.mark(pos, grid);

        //Then: I call input validation once
        verify(inputValidation, times(1)).validate(pos, 3);
    }

    @Test
    public void isEmptyOnce() {
        //Given: it is player 1 turn
        // And: grid size is 3
        // And: player 2 enter [2, 0]
        int[] pos = {2, 0};
        String[][] grid =  {
                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}
        };
        IInputValidation inputValidation = mock(IInputValidation.class);
        when(inputValidation.validate(pos, 3)).thenReturn(true);

        IEmptyPos emptyPos = mock(IEmptyPos.class);
        when(emptyPos.isEmpty(pos,grid)).thenReturn(true);

        //When: I need to validate the input
        IPlayer2 player2 = new Player2(inputValidation, emptyPos);
        player2.mark(pos, grid);

        //Then: I call is empty once
        verify(emptyPos, times(1)).isEmpty(pos, grid);
    }
}
