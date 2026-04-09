import java.util.HashMap;
import java.util.Map;

public class TrainManageApp {
    public static void main(String[] args) {
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);

        bogieCapacityMap.put("Rectangular Cargo", 40);
        bogieCapacityMap.put("Cylindrical Cargo", 30);

        System.out.println("Train Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}
