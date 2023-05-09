package org.example;


public class Main {
    public static void main(String[] args) {
        GridOperations grid = new GridOperations(3,3);
        Game game = new Game(grid);
        game.tick();
        game.tick();


//        for (int row = 0; row < grid.rows; row++) {
//            for (int col = 0; col < grid.columns; col++) {
//                System.out.println(grid.getCell(row, col));
//            }
//        }

//        grid.updateGrid();
//        for (int row = 0; row < grid.rows; row++) {
//            for (int col = 0; col < grid.columns; col++) {
//                System.out.println(grid.getCell(row, col));
//            }
//        }

    }
}