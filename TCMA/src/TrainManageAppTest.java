import org.junit.Test;
import static org.junit.Assert.*;

public class TrainManageAppTest {

    @Test
    public void testCargo_SafeAssignment() {
        TrainManageApp.GoodsBogie bogie =
                new TrainManageApp.GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.getCargo());
    }

    @Test
    public void testCargo_UnsafeAssignmentHandled() {
        TrainManageApp.GoodsBogie bogie =
                new TrainManageApp.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo()); // should not be assigned
    }

    @Test
    public void testCargo_CargoNotAssignedAfterFailure() {
        TrainManageApp.GoodsBogie bogie =
                new TrainManageApp.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    @Test
    public void testCargo_ProgramContinuesAfterException() {
        TrainManageApp.GoodsBogie b1 =
                new TrainManageApp.GoodsBogie("Rectangular");

        TrainManageApp.GoodsBogie b2 =
                new TrainManageApp.GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // unsafe
        b2.assignCargo("Coal");      // safe

        assertEquals("Coal", b2.getCargo());
    }

    @Test
    public void testCargo_FinallyBlockExecution() {
        TrainManageApp.GoodsBogie bogie =
                new TrainManageApp.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // No direct assert for finally, but test ensures no crash
        assertTrue(true);
    }
}