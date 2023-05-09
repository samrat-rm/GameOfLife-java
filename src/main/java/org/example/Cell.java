package org.example;

public class Cell {
    public Address address;
    public boolean state;

    public Cell(Address address, boolean state) {
        this.address = address;
        this.state = state;
    }
    private int countAliveNeighbor(Cell[] neighbors) {
        int countTrue = 0;
        for (Cell neighbor : neighbors) {
            if (neighbor.state) {
                countTrue++;
            }
        }
        return countTrue;
    }
    public boolean updateState(Cell[] neighbors) {
        int countTrue = countAliveNeighbor(neighbors);
        if (countTrue < 2 || countTrue > 3) {
            state = false;
        } else if (countTrue == 3) {
            state = true;
        }
        return state;
    }

    @Override
    public String toString() {
        return "Cell(" + address.row + "," + address.column + "," + state + ")";
    }
}