import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class TrainManageAppTest {

    @Test
    public void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};
        TrainManageApp.sortCapacities(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    public void testSort_AlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};
        TrainManageApp.sortCapacities(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    public void testSort_DuplicateValues() {
        int[] arr = {72, 56, 56, 24};
        TrainManageApp.sortCapacities(arr);

        assertArrayEquals(new int[]{24, 56, 56, 72}, arr);
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] arr = {50};
        TrainManageApp.sortCapacities(arr);

        assertArrayEquals(new int[]{50}, arr);
    }

    @Test
    public void testSort_AllEqualValues() {
        int[] arr = {40, 40, 40};
        TrainManageApp.sortCapacities(arr);

        assertArrayEquals(new int[]{40, 40, 40}, arr);
    }
}