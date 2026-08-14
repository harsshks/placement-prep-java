import java.util.*;

public class pivotindex {
    public static int pivotIndex(int[] nums){
        int leftsum = 0;
        int totalsum = 0;

        for(int num : nums){
            totalsum += num;
        }

        for(int i = 0; i < nums.length; i++){
            int rightsum = totalsum - leftsum - nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int pivotIndex = pivotIndex(nums);
        System.out.println("Pivot index: " + pivotIndex);
        sc.close();
    }

}
