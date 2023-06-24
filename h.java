import java.util.Arrays;

public class h {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println( result[0]);
        System.out.println(  result[1]);
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] == i + 1)
                i++;
            else {
                if (nums[i] == nums[j]) {
                    i++;
                    continue;
                }
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        int[] arr = new int[2];
        for (i = 0; i < nums.length; i++) {
            if (i + 1 == nums[i])
                continue;

            arr[0] = nums[i];
            arr[1] = i + 1;
        }
        return arr;
    }
}
