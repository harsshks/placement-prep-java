public class shipcapacity {
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        // Calculate the minimum and maximum possible capacity
        for (int weight : weights) {
            left = Math.max(left, weight); // Minimum capacity must be at least the heaviest package
            right += weight; // Maximum capacity is the sum of all weights
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid; // Try to find a smaller capacity
            } else {
                left = mid + 1; // Increase capacity
            }
        }
        return left; // Minimum capacity to ship within the given days
    }

    private static boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int requiredDays = 1; // Start with one day

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                requiredDays++; // Need an additional day
                currentLoad = weight; // Start a new shipment
            } else {
                currentLoad += weight; // Add to the current shipment
            }
        }
        return requiredDays <= days; // Check if we can ship within the given days
    }
}
