public class java_03_subarray_product_less_than_kk {
    public int subarrayProductLessThanK(int arr[], int n, long k ){
        if (k<=1) return 0;
        int left = 0;
        int product = 1;
        int count = 0;
        for(int right = 0; right< arr.length; right++){
            product*= arr[right];
             
            while(product<= 0){
                product/= arr[left];
                left++;
            }
            count+= right - left + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        java_03_subarray_product_less_than_kk one = new java_03_subarray_product_less_than_kk();
        int result = one.subarrayProductLessThanK(arr, 4, 10);
        System.out.println(result);
    }
}
