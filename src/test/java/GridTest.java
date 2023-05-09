import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

public class GridTest {

    @Test
    public void testCreateGrid() {
        Grid grid = new Grid(3, 3);
        assertNotNull(grid.grid);
        assertEquals(grid.grid.length, 3);
        assertEquals(grid.grid[0].length, 3);
    }

    @Test
    public void testGetCell() {
        Grid grid = new Grid(3, 3);
        Cell cell = grid.getCell(1, 1);
        assertNotNull(cell);
        assertEquals(cell.address.row, 1);
        assertEquals(cell.address.column, 1);
    }

    @Test
    public void testGetInvalidCell() {
        Grid grid = new Grid(3, 3);
        Cell cell = grid.getCell(-1, -1);
        assertNull(cell);
    }

}
