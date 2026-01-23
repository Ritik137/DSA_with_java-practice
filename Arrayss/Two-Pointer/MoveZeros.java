public class MoveZeros {
    public static void main(String[] args) {
        // Question : Move zero to the right in array
        int arr[] = {1,2,0,3,0,7,0,8,0};
        int pos = 0;
        for(int i =0; i< arr.length; i++){
            if( arr[i] != 0){
                arr[pos] = arr[i];
                pos++;
            }
        } 
         while(pos<arr.length){
            arr[pos] =0;
            pos++;
         }

         for(int x : arr){
            System.out.print(x + " ");
         }
    }
}
