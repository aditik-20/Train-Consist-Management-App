import java.util.LinkedList;

public class TrainManageApp    {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.addLast("Engine");
        trainConsist.addLast("Sleeper");
        trainConsist.addLast("AC");
        trainConsist.addLast("Cargo");
        trainConsist.addLast("Guard");

        trainConsist.add(2, "Pantry");

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Final Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}