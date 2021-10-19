package com.saggezza.tictactoe;

public class InputValidation implements IInputValidation {
    public boolean validate(int[] inputPos, int gridSize) {
     for (int i = 0; i < inputPos.length; i++){
         if (inputPos[i] >= gridSize || inputPos[i] < 0) {
             System.out.println("Invalid input");
             return false;
         }
     }

     return true;
    }
}
