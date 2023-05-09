package org.example;

public class DeadCell extends Cell {

    public DeadCell(Address address ) {
        super(address, false );
    }
    public boolean updateState(Cell[] neighbors) {
        int countTrue = countAliveNeighbor(neighbors);
        if(countTrue == 3){
            return true;
        }
        return false;
    }
}
