public class Java_01_MoveZero {
    public static void main(String[] args) {
        int arr[] = {1, 0, 6, 8, 0, 4, 0, 9};

        int pos = 0; // position for next non-zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != pos) {   // only swap when needed
                    int temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                }
                pos++;
            }
        }

        // print result
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}