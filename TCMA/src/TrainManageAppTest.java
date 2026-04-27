import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class TrainManageAppTest {

    @Test
    public void testSearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        Arrays.sort(arr);

        assertTrue(TrainManageApp.binarySearch(arr, "BG309"));
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        Arrays.sort(arr);

        assertFalse(TrainManageApp.binarySearch(arr, "BG999"));
    }

    @Test
    public void testSearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        Arrays.sort(arr);

        assertTrue(TrainManageApp.binarySearch(arr, "BG101"));
    }

    @Test
    public void testSearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        Arrays.sort(arr);

        assertTrue(TrainManageApp.binarySearch(arr, "BG550"));
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};
        Arrays.sort(arr);

        assertTrue(TrainManageApp.binarySearch(arr, "BG101"));
    }
}