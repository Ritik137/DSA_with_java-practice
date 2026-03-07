public class java_01_max_consecutive_one {

    public int maxConsecutiveOne(int[] nums){
        int count =0;
        int max =0;
        for (int i =0; i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count=0;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int nums [] = {1,1,0,1,1,1,0,1,1,1,1,1};
        java_01_max_consecutive_one code = new java_01_max_consecutive_one();
        int result = code.maxConsecutiveOne(nums);
        System.out.println(result);
    }
}