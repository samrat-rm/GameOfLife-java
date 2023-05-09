import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.*;

public class AliveCellTest {

    @Test
    void testUpdateStateWithFewerThanTwoNeighbors() {
        Address address = new Address(0, 0);
        AliveCell cell = new AliveCell(address);
        Cell deadCell = new DeadCell(new Address(0, 1));
        Cell deadCell2 = new DeadCell(new Address(1, 0));
        Cell[] neighbors = {deadCell, deadCell2};
        assertFalse(cell.updateState(neighbors));
    }

    @Test
    void testUpdateStateWithTwoNeighbors() {
        Address address = new Address(0, 0);
        AliveCell cell = new AliveCell(address);
        Cell deadCell = new DeadCell(new Address(0, 1));
        Cell aliveCell2 = new AliveCell(new Address(1, 0));
        Cell aliveCell = new AliveCell(new Address(1, 1));
        Cell[] neighbors = {deadCell, aliveCell2, aliveCell};
        assertTrue(cell.updateState(neighbors));
    }

    @Test
    void testUpdateStateWithThreeNeighbors() {
        Address address = new Address(0, 0);
        AliveCell cell = new AliveCell(address);
        Cell deadCell = new DeadCell(new Address(0, 1));
        Cell deadCell2 = new DeadCell(new Address(1, 0));
        Cell aliveCell = new AliveCell(new Address(1, 1));
        Cell aliveCell2 = new AliveCell(new Address(0, 2));
        Cell[] neighbors = {deadCell, deadCell2, aliveCell, aliveCell2};
        assertTrue(cell.updateState(neighbors));
    }

    @Test
    void testUpdateStateWithMoreThanThreeNeighbors() {
        Address address = new Address(0, 0);
        AliveCell cell = new AliveCell(address);
        Cell deadCell = new DeadCell(new Address(0, 1));
        Cell aliveCell0 = new AliveCell(new Address(1, 0));
        Cell aliveCell = new AliveCell(new Address(1, 1));
        Cell aliveCell2 = new AliveCell(new Address(0, 2));
        Cell aliveCell3 = new AliveCell(new Address(1, 2));
        Cell[] neighbors = {deadCell, aliveCell0, aliveCell, aliveCell2, aliveCell3};
        assertFalse(cell.updateState(neighbors));
    }


}
