package org.example;

public abstract class BaseGrid {
    public final int rows;
    public final int columns;
    public Cell[][] grid;

    public BaseGrid(int rows, int columns) {
        if (rows < 0 || columns < 0) {
            throw new IllegalArgumentException("Row and column must be greater than or equal to 0.");
        }
        this.rows = rows;
        this.columns = columns;
        this.grid = createGrid(rows, columns);
    }

    private Cell createCell(int row, int col) {
        Address address = new Address(row, col);
        boolean state = Math.random() < 0.5;
        if(state){
            return new AliveCell(address);
        }else{
            return new DeadCell(address);
        }

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
