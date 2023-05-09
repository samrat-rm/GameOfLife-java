import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

public class BaseGridTest {

    @Test
    public void testCreateGrid() {
        GridOperations baseGrid = new GridOperations(3, 3);
        assertNotNull(baseGrid.grid);
        assertEquals(baseGrid.grid.length, 3);
        assertEquals(baseGrid.grid[0].length, 3);
    }

    @Test
    public void testGetCell() {
        GridOperations baseGrid = new GridOperations(3, 3);
        Cell cell = baseGrid.getCell(1, 1);
        assertNotNull(cell);
        assertEquals(cell.address.row, 1);
        assertEquals(cell.address.column, 1);
    }

    @Test
    public void testGetInvalidCell() {
        GridOperations baseGrid = new GridOperations(3, 3);
        Cell cell = baseGrid.getCell(-1, -1);
        assertNull(cell);
    }
}
