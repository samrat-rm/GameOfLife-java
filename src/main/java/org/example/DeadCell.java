package org.example;

public class DeadCell extends Cell {

    public DeadCell(Address address ) {
        super(address, false );
    }
    public boolean updateState(Cell[] neighbors) {
        int countTrue = countAliveNeighbor(neighbors);
        boolean updatedState = state ;
        if(countTrue == 3){
            updatedState = true;
        }
        return updatedState;
    }
}
