package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cell cell = new Cell(new Address(0, 0), false);
        Random random = new Random();
        Cell[] neighbors = new Cell[8]; // Assuming 8 neighbors (for a 3x3 grid)
        for (int i = 0; i < neighbors.length; i++) {
            int randomRow = random.nextInt(3); // Random row between 0 and 2
            int randomColumn = random.nextInt(3); // Random column between 0 and 2
            boolean randomState = random.nextBoolean(); // Random true/false state
            neighbors[i] = new Cell(new Address(randomRow, randomColumn), randomState);
            System.out.println(randomState);
        }
        boolean updatedState = cell.updateState(neighbors);
        System.out.println("update");
        System.out.println(updatedState);
    }

}