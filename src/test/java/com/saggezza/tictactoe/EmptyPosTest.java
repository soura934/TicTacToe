package com.saggezza.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmptyPosTest {

    @Test
    public void isEmptyTest(){
        // Given the pos I enter is 2 0
        // And the grid size is 3
        int[] pos = {2, 0};
        String[][] grid =  {
                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}
        };

        // When I check if the position is empty
        IEmptyPos emptyPos = new EmptyPos();

        // I should get back true
        assertTrue(emptyPos.isEmpty(pos, grid));
    }

    @Test
    public void isEmptyTest2(){
        // Given the pos I enter is 2 0
        // And the grid size is 3
        int[] pos = {2, 0};
        String[][] grid =  {
                {"-","-","-"},
                {"-","-","-"},
                {"X","-","-"}
        };

        // When I check if the position is empty
        IEmptyPos emptyPos = new EmptyPos();

        // I should get back true
        assertFalse(emptyPos.isEmpty(pos, grid));
    }
}
