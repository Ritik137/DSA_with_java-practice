public class Java_03_sort_color {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }

    }

    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };

        Java_03_sort_color sorter = new Java_03_sort_color();
        sorter.sortColors(nums);  

        for (int i : nums) {
            System.out.print(i+ " ");
        }
    }
}
