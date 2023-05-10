import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;


public class GameTest {

    @Test
    public void testConstructor() {
        // Test valid input
        GridOperations grid = new GridOperations(3, 3);
        Game game = new Game(grid);
        // Test null input
        assertThrows(IllegalArgumentException.class, () -> new Game(null));
    }

    @Test
    public void testTick() {
        GridOperations grid = new GridOperations(3, 3);
        for (int row = 0; row < grid.rows; row++) {
            for (int col = 0; col < grid.columns; col++) {
                grid.grid[row][col].state = true;
            }
        }
        // setup
//        grid.grid[0][1].state = false;
//        grid.grid[1][2].state = false;
//        grid.grid[2][2].state = false;
        GridOperations expectedGrid = new GridOperations(3,3);
        // expected grid
        for (int row = 0; row < expectedGrid.rows; row++) {
            for (int col = 0; col < expectedGrid.columns; col++) {
                expectedGrid.grid[row][col].state = false;
            }
        }
        expectedGrid.grid[0][0].state = true;
        expectedGrid.grid[2][0].state = true;
        expectedGrid.grid[2][2].state = true;
        expectedGrid.grid[0][2].state = true;

        Game game = new Game(grid);
        GridOperations updatedGrid = game.tick();
        // Test that the cells in the updated grid have been updated
        for (int row = 0; row < updatedGrid.rows; row++) {
            for (int col = 0; col < updatedGrid.columns; col++) {
                Cell cell = updatedGrid.getCell(row, col);
                assertNotNull(cell);
                // Test that the cell's state has been updated
                boolean expectedState = expectedGrid.getCell(row,col).state;
                assertEquals(expectedState, cell.state);
            }
        }
    }
}
