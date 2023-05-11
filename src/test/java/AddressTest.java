import org.example.Address;
import static org.junit.Assert.*;
import org.junit.Test;

public class AddressTest {
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeColumn() {
        new Address(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeRowAndColumn() {
        new Address(-1, -1);
    }

    @Test
    public void testConstructor() {
        Address address = new Address(2, 5);
        assertEquals(2, address.row);
        assertEquals(5, address.column);
    }

    @Test
    public void testProperties() {
        Address address = new Address(2, 5);
        address.row = 3;
        address.column = 7;
        assertEquals(3, address.row);
        assertEquals(7, address.column);
    }
}