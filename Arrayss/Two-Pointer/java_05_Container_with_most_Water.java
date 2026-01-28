public class java_05_Container_with_most_Water {
    public static int maxArea(int[] height ){
         int left = 0;
         int right  = height.length -1;
         int max = 0;
         while(left<right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int a =  h * w;
            max = Math.max(max, a);
            if(height[left]< height[right]){
                left++;
            }else{
                right--;
            }
         }
         return max;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println( "Container with most water : "+result);
    }
}
