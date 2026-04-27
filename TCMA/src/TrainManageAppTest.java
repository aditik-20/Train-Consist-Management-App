import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class TrainManageAppTest {

    @Test
    public void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};
        TrainManageApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    public void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};
        TrainManageApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    public void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};
        TrainManageApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General"},
                arr
        );
    }

    @Test
    public void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};
        TrainManageApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Sleeper","Sleeper"},
                arr
        );
    }

    @Test
    public void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};
        TrainManageApp.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"Sleeper"},
                arr
        );
    }
}
