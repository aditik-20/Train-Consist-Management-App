public class TrainManageApp {

    // Bubble Sort Method
    public static void sortCapacities(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Each pass
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print array
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Before Sorting: ");
        display(capacities);

        sortCapacities(capacities);

        System.out.print("After Sorting: ");
        display(capacities);
    }
}