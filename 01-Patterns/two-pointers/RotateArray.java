public class RotateArray {
    // public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;
    //     for(int i = 0; i < k; i++){
    //         int last = nums[n-1];
    //         for(int j = n-1; j > 0; j--){
    //             nums[j] = nums[j-1];
    //         }
    //         nums[0] = last;
    //     }
    // }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k is greater than n
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.print("Rotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
