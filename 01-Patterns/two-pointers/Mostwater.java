public class Mostwater {
    public int maxArea(int[] height){
        int left = 0; 
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int currheight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currheight * (right - left));
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Mostwater mw = new Mostwater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = mw.maxArea(height);
        System.out.println("Maximum area: " + result);
    }
}
