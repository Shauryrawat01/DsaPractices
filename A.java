import java.util.Arrays;

class A {
    public static int[] A(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int a[] = {i, j};
                    return a;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target =9;
        int bb[]=A(nums,target);
        System.out.println(Arrays.toString(bb));
    }
}