package org.example;

public class Game {
    private GridOperations grid;

    public Game(GridOperations grid) {
        if (grid == null) {
            throw new IllegalArgumentException("Invalid grid");
        }
        this.grid = grid;
        this.printCurrentGrid(this.grid);
    }

    private void printCurrentGrid(GridOperations grid) {
        System.out.println("\n");
        int rows = grid.rows;
        int columns = grid.columns;
        StringBuilder output = new StringBuilder();
        // building a output string
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                output.append(grid.getCell(row, col).state ? " O " : " - ");
            }
            output.append("\n");
        }
        // clearing the console and printing the output
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(output.toString());
    }

    public GridOperations tick() {
        this.grid.updateGrid();
        this.printCurrentGrid(this.grid);
        return this.grid;
    }
}