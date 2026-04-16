import java.util.*;
import java.util.stream.Collectors;

abstract class Bogie {
    protected String bogieId;
    protected String type;
    protected int capacity;

    public Bogie(String bogieId, String type, int capacity) {
        this.bogieId = bogieId;
        this.type = type;
        this.capacity = capacity;
    }

    public String getBogieId() {
        return bogieId;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return "Bogie ID=" + bogieId + ", Type=" + type + ", Capacity=" + capacity;
    }
}

class PassengerBogie extends Bogie {
    public PassengerBogie(String bogieId, String type, int capacity) {
        super(bogieId, type, capacity);
    }
}

public class TrainManageApp {

    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
    }

    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("PB101", "Sleeper", 72));
        bogies.add(new PassengerBogie("PB102", "AC Chair", 60));
        bogies.add(new PassengerBogie("PB103", "First Class", 45));
        bogies.add(new PassengerBogie("PB104", "Sleeper", 80));
        bogies.add(new PassengerBogie("PB105", "AC Chair", 70));

        Map<String, List<Bogie>> grouped = groupBogiesByType(bogies);

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(System.out::println);
            System.out.println();
        }
    }
}