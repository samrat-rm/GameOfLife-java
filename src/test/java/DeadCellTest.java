
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.*;

public class DeadCellTest {
    @Test
    void testUpdateStateWithLessThanThreeNeighbors() {
        Address address = new Address(0, 0);
        DeadCell cell = new DeadCell(address);
        DeadCell cell1 = new DeadCell(new Address(0, 1));
        DeadCell cell2 = new DeadCell(new Address(1, 0));
        Cell[] neighbors = {cell1,cell2 };
        assertFalse(cell.updateState(neighbors));
    }

    @Test
    void testUpdateStateWithThreeNeighbors() {
        Address address = new Address(0, 0);
        DeadCell cell = new DeadCell(address);
        AliveCell cell1 =new AliveCell(new Address(0, 1));
        AliveCell cell2 =  new AliveCell(new Address(1, 0));
        AliveCell cell3 =new AliveCell(new Address(1, 1));

        Cell[] neighbors = {cell1,cell2,cell3 };
        assertTrue(cell.updateState(neighbors));
    }

    @Test
    void testUpdateStateWithMoreThanThreeNeighbors() {
        Address address = new Address(0, 0);
        DeadCell cell = new DeadCell(address);
        DeadCell cell1 =new DeadCell(new Address(0, 1));
        AliveCell cell2 =  new AliveCell(new Address(1, 0));
        AliveCell cell3 =  new AliveCell(new Address(1, 1));
        AliveCell cell4 =  new AliveCell(new Address(1, 1));
        AliveCell cell5 = new AliveCell(new Address(0, 2));
        AliveCell cell6 = new AliveCell(new Address(1, 2));
        Cell[] neighbors = {cell1,cell6,cell5,cell4,cell3 , cell2 };
        assertFalse(cell.updateState(neighbors));
    }

    @Test
    void testUpdateStateWithTwoNeighbors() {
        Address address = new Address(0, 0);
        DeadCell cell = new DeadCell(address);
        DeadCell cell1 = new DeadCell(new Address(0, 1));
        DeadCell cell2 =  new DeadCell(new Address(1, 0));
        AliveCell cell3 = new AliveCell(new Address(1, 1));
        Cell[] neighbors = {cell1,cell2,cell3 };
        assertFalse(cell.updateState(neighbors));
    }

}
