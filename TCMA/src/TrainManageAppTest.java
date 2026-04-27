import org.junit.Test;
import static org.junit.Assert.*;

public class TrainManageAppTest {

    @Test(expected = IllegalStateException.class)
    public void testSearch_EmptyTrainThrowsException() {
        String[] arr = {};
        TrainManageApp.searchBogie(arr, "BG101");
    }

    @Test
    public void testSearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(TrainManageApp.searchBogie(arr, "BG205"));
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309"};

        assertFalse(TrainManageApp.searchBogie(arr, "BG999"));
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};

        assertTrue(TrainManageApp.searchBogie(arr, "BG101"));
    }

    @Test
    public void testSearch_ExceptionMessageValidation() {
        try {
            String[] arr = {};
            TrainManageApp.searchBogie(arr, "BG101");
            fail("Exception not thrown");
        } catch (IllegalStateException e) {
            assertEquals("Train consist is empty. Cannot perform search operation.", e.getMessage());
        }
    }
}