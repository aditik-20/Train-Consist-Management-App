import java.util.HashSet;
import java.util.Set;

public class TrainManageApp {

    public static void main(String[] args) {

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG104");
        bogieIds.add("BG102");

        System.out.println("Unique Bogie IDs in Train Consist:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
    }
}