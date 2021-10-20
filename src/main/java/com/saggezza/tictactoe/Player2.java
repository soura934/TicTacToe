package com.saggezza.tictactoe;

public class Player2 implements IPlayer2 {

    public IInputValidation inputValidation;
    public IEmptyPos emptyPos;

    public Player2(IInputValidation inputValidation, IEmptyPos emptyPos) {
        this.inputValidation = inputValidation;
        this.emptyPos = emptyPos;
    }

    public void mark(int[] pos, String[][] grid) {
        if (inputValidation.validate(pos, grid.length) && emptyPos.isEmpty(pos, grid)){
            grid[pos[0]][pos[1]] = "O";
        } else {
            System.out.println("Position is not valid");
        }
    }
}
