package org.example;

public class Grid {
    public final int rows;
    public final int columns;
    public Cell[][] grid;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.grid = createGrid(rows, columns);
    }

    private Cell createCell(int row, int col) {
        Address address = new Address(row, col);
        boolean state = Math.random() < 0.5;
        return new Cell(address, state);
    }

    private Cell[][] createGrid(int rows, int columns) {
        Cell[][] grid = new Cell[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                grid[row][col] = createCell(row, col);
            }
        }
        return grid;
    }

    public Cell getCell(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < columns) {
            return grid[row][col];
        } else {
            return null;
        }
    }

}
