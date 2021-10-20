package com.saggezza.tictactoe;

import java.util.Arrays;

public class DisplayGrid implements IDisplayGrid{
    public void display(String[][] grid) {
        System.out.println(Arrays.deepToString(grid).replace("], ", "]\n"));
    }
}
