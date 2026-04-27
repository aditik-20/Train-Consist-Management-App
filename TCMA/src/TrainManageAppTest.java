import org.junit.Test;
import static org.junit.Assert.*;

public class TrainManageAppTest {

    @Test
    public void testException_ValidCapacityCreation() throws Exception {
        TrainManageApp.PassengerBogie bogie =
                new TrainManageApp.PassengerBogie("Sleeper", 50);

        assertEquals("Sleeper", bogie.getType());
        assertEquals(50, bogie.getCapacity());
    }

    @Test(expected = TrainManageApp.InvalidCapacityException.class)
    public void testException_NegativeCapacityThrowsException() throws Exception {
        new TrainManageApp.PassengerBogie("AC", -10);
    }

    @Test(expected = TrainManageApp.InvalidCapacityException.class)
    public void testException_ZeroCapacityThrowsException() throws Exception {
        new TrainManageApp.PassengerBogie("FirstClass", 0);
    }

    @Test
    public void testException_ExceptionMessageValidation() {
        try {
            new TrainManageApp.PassengerBogie("Sleeper", 0);
            fail("Exception not thrown");
        } catch (TrainManageApp.InvalidCapacityException e) {
            assertEquals("Capacity must be greater than zero", e.getMessage());
        }
    }

    @Test
    public void testException_ObjectIntegrityAfterCreation() throws Exception {
        TrainManageApp.PassengerBogie bogie =
                new TrainManageApp.PassengerBogie("AC Chair", 60);

        assertEquals("AC Chair", bogie.getType());
        assertEquals(60, bogie.getCapacity());
    }

    @Test
    public void testException_MultipleValidBogiesCreation() throws Exception {
        TrainManageApp.PassengerBogie b1 =
                new TrainManageApp.PassengerBogie("Sleeper", 72);

        TrainManageApp.PassengerBogie b2 =
                new TrainManageApp.PassengerBogie("AC", 50);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}