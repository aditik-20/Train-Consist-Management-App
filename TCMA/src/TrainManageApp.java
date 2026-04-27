import java.util.Arrays;

public class TrainManageApp {

    // Binary Search method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return true; // found
            } else if (result < 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return false; // not found
    }

    // Main method
    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure sorted (precondition)
        Arrays.sort(bogieIds);

        String searchKey = "BG309";

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println(searchKey + " FOUND in train consist.");
        } else {
            System.out.println(searchKey + " NOT FOUND in train consist.");
        }
    }
}