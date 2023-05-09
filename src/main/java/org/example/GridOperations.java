package org.example;

import java.util.ArrayList;
import java.util.List;

public class GridOperations extends BaseGrid {
    public GridOperations(int rows, int cols) {
        super(rows, cols);
    }
    public Cell[][] updateGrid() {
        // create a new grid to hold the updated cells
        Cell[][] updatedGrid = new Cell[rows][columns];

        for (int row = 0; row < rows; row++) {
//            System.out.println("\n ");
            for (int col = 0; col < columns; col++) {
                // get the current cell and its neighbors
                Cell currentCell = grid[row][col];
                Cell[] neighbors = findNeighbors(currentCell);
//                for (Cell cell : neighbors) {
//                    System.out.printf( "%s %s %d %d \n",cell , "updated" ,row, col);
//                }
                // update the cell's state
                boolean updatedState = currentCell.updateState(neighbors);

                // create a new cell with the updated state and add it to the updated grid
                Cell updatedCell = new Cell(currentCell.address, updatedState);
                updatedGrid[row][col] = updatedCell;
            }
        }
        // replace the old grid with the updated grid
        grid = updatedGrid;
        return updatedGrid;
    }

    public Cell[] findNeighbors(Cell cell) {
        List<Cell> neighbors = new ArrayList<>();
        int row = cell.address.row;
        int col = cell.address.column;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r >= 0 && r < rows && c >= 0 && c < columns && !(r == row && c == col )) {
                    neighbors.add(grid[r][c]);
                }
            }
        }
//        System.out.println(neighbors.size());
        return neighbors.toArray(new Cell[0]);
    }


}
