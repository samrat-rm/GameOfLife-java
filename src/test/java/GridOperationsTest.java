import org.junit.jupiter.api.Test;
import org.example.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class
GridOperationsTest {

    @Test
    public void testUpdateGridEmptyGrid() {
        GridOperations grid = new GridOperations(3, 3);
        Cell[][] updatedGrid = grid.updateGrid();
        assertArrayEquals(grid.grid, updatedGrid);
    }

    @Test
    public void testUpdateGridUnderpopulation() {
        GridOperations grid = new GridOperations(3, 3);

        for (int row = 0; row < grid.rows; row++) {
            for (int col = 0; col < grid.columns; col++) {
                grid.grid[row][col].state = false;
            }
        }

        // Setup
        grid.grid[1][1].state = true;
        Cell cel;
        Cell[][] updatedGrid = grid.updateGrid();
        assertFalse(updatedGrid[1][1].state);
    }

    @Test
    public void testUpdateGridSurvival() {
        GridOperations grid = new GridOperations(3, 3);

        for (int row = 0; row < grid.rows; row++) {
            for (int col = 0; col < grid.columns; col++) {
                grid.grid[row][col].state = false;
            }
        }

        // Setup
        grid.grid[1][1].state = true;
        grid.grid[0][0].state = true;
        grid.grid[0][1].state = true;
        grid.grid[0][2].state = true;

        Cell[][] updatedGrid = grid.updateGrid();
        assertTrue(updatedGrid[1][1].state);
    }

    @Test
    public void testUpdateGridOvercrowding() {
        GridOperations grid = new GridOperations(3, 3);
        for( int i=0 ; i< grid.rows ; i++){
            for(int j =0 ; j< grid.columns ; j++){
                grid.grid[i][j].state = false;
            }
        }
        grid.grid[1][1].state = true;
        grid.grid[0][0].state = true;
        grid.grid[0][1].state = true;
        grid.grid[0][2].state = true;
        grid.grid[1][0].state = true;

        Cell[][] updatedGrid = grid.updateGrid();

        assertFalse(updatedGrid[1][1].state);
    }
}
