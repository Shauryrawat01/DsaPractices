public class C {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                break;
            }
        }
        System.out.println(start);
        return start;
    }

    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target =5;
        int cc=searchInsert(nums,target);
    }
}
