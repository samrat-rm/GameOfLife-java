package org.example;

public abstract class Cell {
    public Address address;
    public boolean state;

    public Cell(Address address, boolean state) {
        this.address = address;
        this.state = state;
    }
    public int countAliveNeighbor(Cell[] neighbors) {
        int countTrue = 0;
        for (Cell neighbor : neighbors) {
            if ( neighbor.state) {
                countTrue++;
            }
        }
        return countTrue;
    }
    public abstract boolean updateState(Cell[] neighbors);
    @Override
    public String toString() {
        return "Cell(" + address.row + "," + address.column + "," + state + ")";
    }
}