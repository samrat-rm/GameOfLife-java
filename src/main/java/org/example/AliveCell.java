package org.example;

public class AliveCell extends Cell {

    public AliveCell(Address address ) {
        super(address, true );
    }
    public boolean updateState(Cell[] neighbors) {
        int countTrue = countAliveNeighbor(neighbors);
        if(countTrue < 2 || countTrue > 3){
            return false;
        }
        return true;
    }
}
