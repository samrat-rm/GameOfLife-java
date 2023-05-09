import org.example.Address;
import static org.junit.Assert.*;
import org.junit.Test;

public class AddressTest {

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