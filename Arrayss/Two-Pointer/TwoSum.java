import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[] { l + 1, r + 1 };

            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

        int numbers[] = { 2, 4, 5, 7, 9, 10 };
        int target = 13;

        int[] result = obj.twoSum(numbers, target);
        // System.out.println(result[0]+ " "+ result[1]);
        System.out.print(Arrays.toString(result));

    }

}

// public class TwoSum {

// public int[] twoSum(int[] numbers, int target) {

// int l = 0;
// int r = numbers.length - 1;

// while (l < r) {
// int sum = numbers[l] + numbers[r];

// if (sum == target) {
// return new int[]{l + 1, r + 1};
// }
// else if (sum < target) {
// l++;
// }
// else {
// r--;
// }
// }

// return new int[]{-1, -1};
// }

// public static void main(String[] args) {

// TwoSum obj = new TwoSum();

// int[] numbers = {1, 2, 3, 4, 5};
// int target = 6;

// int[] result = obj.twoSum(numbers, target);

// System.out.println(result[0] + " " + result[1]);
// }
// }
