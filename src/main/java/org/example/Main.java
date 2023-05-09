package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GridOperations gridOps = new GridOperations(3,3);
        Cell cell = gridOps.getCell(1,1);
        List<Cell> neighbors = gridOps.findNeighbors(cell);
        System.out.println(neighbors); // prints the 8 neighbors of the cell at (2, 2)
        System.out.println(gridOps); // prints the 8 neighbors of the cell at (2, 2)

        for (int row = 0; row < gridOps.rows; row++) {
            for (int col = 0; col < gridOps.columns; col++) {
                Cell cell0 = gridOps.getCell(row,col);
                System.out.println(cell0);
            }
        }
    }
}