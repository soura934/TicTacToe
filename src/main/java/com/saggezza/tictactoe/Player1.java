package com.saggezza.tictactoe;

public class Player1 implements IPlayer1 {

    public IInputValidation inputValidation;

    public Player1(IInputValidation inputValidation) {
        this.inputValidation = inputValidation;
    }

    public void mark(int[] pos, String[][] grid) {
        if (inputValidation.validate(pos, grid.length)){
            grid[pos[0]][pos[1]] = "X";
        }
    }
}
