package com.saggezza.tictactoe;

public class InputConversion implements IInputConversion{

    public int[] conversion(String input) {
        String[] stringInt = input.split("");
        int[] inputPosArray = new int[stringInt.length];

        for (int i = 0; i < inputPosArray.length; i++) {
            inputPosArray[i] = Integer.parseInt(stringInt[i]);
        }
        return inputPosArray;
    }
}
