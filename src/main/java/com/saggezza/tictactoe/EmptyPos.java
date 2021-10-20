package com.saggezza.tictactoe;

public class EmptyPos implements IEmptyPos{
    public boolean isEmpty(int[] pos, String[][] grid) {
        return (grid[pos[0]][pos[1]]).equals("-");
    }
}
