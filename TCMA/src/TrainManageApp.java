public class TrainManageApp {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger Bogie Class
    static class PassengerBogie {
        private String type;
        private int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    // Main Method
    public static void main(String[] args) {
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println(b1.getType() + " - " + b1.getCapacity());

            PassengerBogie b2 = new PassengerBogie("AC Chair", 0); // will throw exception
            System.out.println(b2.getType() + " - " + b2.getCapacity());

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
=======
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