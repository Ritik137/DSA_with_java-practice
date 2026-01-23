import java.util.Arrays;

public class RandomQuestions {

    public int[] twoSum(int arr[], int target){
        int l = 0;
        int r = arr.length -1;
        while(l<r){
            int sum = arr[l] + arr[r];
            if(sum == target){
            return new int []{l+1, r+1};
            }
            else if(sum < target){
                l++;
            } else{
                r--;
            }
        }
        return new int[]{-1,-1};

    }

    public void  shiftZero( int[] numbers){
        int pos = 0;
        for (int i = 1; i < numbers.length; i++) {
                // numbers[pos] = numbers[i];
                if(numbers[i]!=0){
                numbers[pos] = numbers[i];
                pos++;

                }  
        }
        while(pos<numbers.length){
            numbers[pos]=0;
            pos++;
        }
       
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,7,9,12,56,76};
        int numbers[] =  {1, 2, 0, 4, 0, 5, 0};


        int target = 79;

        RandomQuestions rq = new RandomQuestions();
        int [] result = rq.twoSum(arr, target);

        rq.shiftZero(numbers);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(numbers));
    }


}
