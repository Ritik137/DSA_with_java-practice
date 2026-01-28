
public class java_04_trapping_rain_water {

    public int trap(int[] height) {
        int left = 0, leftMax = 0;
        int right = height.length - 1, rightMax = 0;
        int water = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(height[left], leftMax);
                water += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }

        }
        return water;
    }
    public static void main(String[] args) {
        java_04_trapping_rain_water sol = new java_04_trapping_rain_water();
        int[ ] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = sol.trap(height);
        System.out.println("Trapped rain water: " + result);
    }
}
