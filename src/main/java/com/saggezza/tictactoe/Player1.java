package com.saggezza.tictactoe;

public class Player1 implements IPlayer1 {

    public IInputValidation inputValidation;
    public IEmptyPos emptyPos;
    public Player1(IInputValidation inputValidation, IEmptyPos emptyPos) {
        this.inputValidation = inputValidation;
        this.emptyPos = emptyPos;
    }

    public void mark(int[] pos, String[][] grid) {
        if (inputValidation.validate(pos, grid.length) && emptyPos.isEmpty(pos, grid)){
            grid[pos[0]][pos[1]] = "X";
        } else {
            System.out.println("Position is not valid");
        }
    }
}
