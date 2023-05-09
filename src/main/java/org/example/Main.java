package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(3, 3);

        for (int row = 0; row < grid.rows; row++) {
            for (int col = 0; col < grid.columns; col++) {
                Cell cell = grid.grid[row][col];
                System.out.println(cell);
            }
        }
    }
}