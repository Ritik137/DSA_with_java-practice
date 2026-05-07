public class Java_01_MoveZero {
    public static void main(String[] args) {
        int arr[] = {1, 0, 6, 8, 0, 4, 0, 9};

        
        int left =0;
        int n=  arr.length;
        for (int right=0; right<n; right++){
            if(arr[right]!=0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}