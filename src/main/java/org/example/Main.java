package org.example;

public class Main {
    public static void main(String[] args) {
        GridOperations grid = new GridOperations(3,3);
        Game game = new Game( grid);
        game.tick();
        game.tick();
        game.tick();
        game.tick();
    }
}