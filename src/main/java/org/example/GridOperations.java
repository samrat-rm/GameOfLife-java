package org.example;

import java.util.ArrayList;
import java.util.List;

public class GridOperations extends BaseGrid {
    public GridOperations(int rows, int cols) {
        super(rows, cols);
    }
    public List<Cell> findNeighbors(Cell cell) {
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
        return neighbors;
    }
}
