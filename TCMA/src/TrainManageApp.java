public class TrainManageApp {

    // Search method with state validation
    public static boolean searchBogie(String[] bogies, String key) {

        // Fail-fast check
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("Train consist is empty. Cannot perform search operation.");
        }

        // Linear search
        for (int i = 0; i < bogies.length; i++) {
            if (bogies[i].equals(key)) {
                return true;
            }
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {

        String[] bogieIds = {}; // empty case to trigger exception

        try {
            boolean found = searchBogie(bogieIds, "BG101");

            if (found) {
                System.out.println("Bogie FOUND");
            } else {
                System.out.println("Bogie NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}