import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

public class BaseGridTest {

    @Test
    public void testCreateGrid() {
        BaseGrid baseGrid = new BaseGrid(3, 3);
        assertNotNull(baseGrid.grid);
        assertEquals(baseGrid.grid.length, 3);
        assertEquals(baseGrid.grid[0].length, 3);
    }

    @Test
    public void testGetCell() {
        BaseGrid baseGrid = new BaseGrid(3, 3);
        Cell cell = baseGrid.getCell(1, 1);
        assertNotNull(cell);
        assertEquals(cell.address.row, 1);
        assertEquals(cell.address.column, 1);
    }

    @Test
    public void testGetInvalidCell() {
        BaseGrid baseGrid = new BaseGrid(3, 3);
        Cell cell = baseGrid.getCell(-1, -1);
        assertNull(cell);
    }
}
