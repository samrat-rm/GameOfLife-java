import org.junit.jupiter.api.Test;

import org.example.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GridOperationsTest {
    @Test
    public void testFindNeighbors() {
        // create a 3x3 grid
        GridOperations gridOps = new GridOperations(3, 3);

        // get the center cell and its neighbors
        Cell center = gridOps.getCell(1, 1);
        List<Cell> neighbors = gridOps.findNeighbors(center);

        // check that the neighbors list contains the expected cells
        assertEquals(8, neighbors.size());
        assertTrue(neighbors.contains(gridOps.getCell(0, 0)));
        assertTrue(neighbors.contains(gridOps.getCell(0, 1)));
        assertTrue(neighbors.contains(gridOps.getCell(0, 2)));
        assertTrue(neighbors.contains(gridOps.getCell(1, 0)));
        assertTrue(neighbors.contains(gridOps.getCell(1, 2)));
        assertTrue(neighbors.contains(gridOps.getCell(2, 0)));
        assertTrue(neighbors.contains(gridOps.getCell(2, 1)));
        assertTrue(neighbors.contains(gridOps.getCell(2, 2)));
    }

    @Test
    public void testFindNeighborsAtEdge() {
        // create a 3x3 grid
        GridOperations gridOps = new GridOperations(3, 3);

        // get the top-left corner cell and its neighbors
        Cell corner = gridOps.getCell(0, 0);
        List<Cell> neighbors = gridOps.findNeighbors(corner);

        // check that the neighbors list contains the expected cells
        assertEquals(3, neighbors.size());
        assertTrue(neighbors.contains(gridOps.getCell(0, 1)));
        assertTrue(neighbors.contains(gridOps.getCell(1, 0)));
        assertTrue(neighbors.contains(gridOps.getCell(1, 1)));
    }

    @Test
    public void testFindNeighborsAtCorner() {
        // create a 1x1 grid
        GridOperations gridOps = new GridOperations(1, 1);

        // get the only cell and its neighbors
        Cell cell = gridOps.getCell(0, 0);
        List<Cell> neighbors = gridOps.findNeighbors(cell);

        // check that the neighbors list is empty
        assertEquals(0, neighbors.size());
    }
}
