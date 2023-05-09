package org.example;

public class AliveCell extends Cell {

    public AliveCell(Address address ) {
        super(address, true );
    }
    public boolean updateState(Cell[] neighbors) {
        int countTrue = countAliveNeighbor(neighbors);
        boolean updatedState = state ;
        if(countTrue < 2 || countTrue > 3){
            updatedState = false;
        }
        return updatedState;
    }
}
