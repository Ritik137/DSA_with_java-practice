public class java_02_max_consecutive_III {
    public int maxConsecutive(int arr[], int k){
        int left =0, right=0;
        int zeroCount =0;
        int maxLen =0;
        while(right < arr.length){
            if(arr[right]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(arr[left]==0){
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1, 0, 1};
        java_02_max_consecutive_III one = new java_02_max_consecutive_III();
        int result = one.maxConsecutive(arr, 2);
        System.out.println(result);
    }
}
