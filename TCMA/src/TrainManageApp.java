public class TrainManageApp {

    // Linear Search method
    public static boolean searchBogie(String[] bogies, String key) {

        for (int i = 0; i < bogies.length; i++) {
            if (bogies[i].equals(key)) {
                return true; // early termination when found
            }
        }

        return false; // not found after full traversal
    }

    // Main method
    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309";

        boolean found = searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println(searchKey + " is FOUND in the train consist.");
        } else {
            System.out.println(searchKey + " is NOT FOUND in the train consist.");
        }
    }
}