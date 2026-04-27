import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TrainManageAppTest {

    @Test
    void testLoopFilteringLogic() {
        List<TrainManageApp.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainManageApp.Bogie("Sleeper", 50));
        bogies.add(new TrainManageApp.Bogie("AC Chair", 80));

        List<TrainManageApp.Bogie> result =
                TrainManageApp.filterWithLoop(bogies);

        assertEquals(1, result.size());
        assertEquals(80, result.get(0).capacity);
    }

    @Test
    void testStreamFilteringLogic() {
        List<TrainManageApp.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainManageApp.Bogie("Sleeper", 40));
        bogies.add(new TrainManageApp.Bogie("First Class", 100));

        List<TrainManageApp.Bogie> result =
                TrainManageApp.filterWithStream(bogies);

        assertEquals(1, result.size());
        assertEquals(100, result.get(0).capacity);
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<TrainManageApp.Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            bogies.add(new TrainManageApp.Bogie("Bogie-" + i, i * 10));
        }

        List<TrainManageApp.Bogie> loopResult =
                TrainManageApp.filterWithLoop(bogies);

        List<TrainManageApp.Bogie> streamResult =
                TrainManageApp.filterWithStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
        assertIterableEquals(loopResult, streamResult);
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<TrainManageApp.Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            bogies.add(new TrainManageApp.Bogie("Bogie-" + i, i % 100));
        }

        long start = System.nanoTime();
        TrainManageApp.filterWithLoop(bogies);
        long end = System.nanoTime();

        long elapsed = end - start;
        assertTrue(elapsed > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<TrainManageApp.Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new TrainManageApp.Bogie("Bogie-" + i, (i % 100) + 1));
        }

        List<TrainManageApp.Bogie> loopResult =
                TrainManageApp.filterWithLoop(bogies);

        List<TrainManageApp.Bogie> streamResult =
                TrainManageApp.filterWithStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }
}