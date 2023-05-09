import org.junit.Test;
import static org.junit.Assert.*;
import org.example.Cell;
import org.example.Address;
public class CellTest {
    @Test
    public void testUpdateState() {
        // Test case 1: 2 true neighbors
        Cell[] neighbors1 = {
                new Cell(new Address(0, 0), true),
                new Cell(new Address(0, 1), true),
                new Cell(new Address(1, 0), true),
                new Cell(new Address(1, 1), false)
        };
        Cell cell1 = new Cell(new Address(0, 0), false);
        assertTrue(cell1.updateState(neighbors1));

        // Test case 2: 3 true neighbors
        Cell[] neighbors2 = {
                new Cell(new Address(0, 0), true),
                new Cell(new Address(0, 1), false),
                new Cell(new Address(1, 0), true),
                new Cell(new Address(1, 1), true)
        };
        Cell cell2 = new Cell(new Address(0, 0), false);
        assertTrue(cell2.updateState(neighbors2));

        // Test case 3: 1 true neighbor
        Cell[] neighbors3 = {
                new Cell(new Address(0, 0), true),
                new Cell(new Address(0, 1), false),
                new Cell(new Address(1, 0), false),
                new Cell(new Address(1, 1), false)
        };
        Cell cell3 = new Cell(new Address(0, 0), true);
        assertFalse(cell3.updateState(neighbors3));

        // Test case 4: 4 true neighbors
        Cell[] neighbors4 = {
                new Cell(new Address(0, 0), true),
                new Cell(new Address(0, 1), true),
                new Cell(new Address(1, 0), true),
                new Cell(new Address(1, 1), true)
        };
        Cell cell4 = new Cell(new Address(0, 0), true);
        assertFalse(cell4.updateState(neighbors4));
    }
}
