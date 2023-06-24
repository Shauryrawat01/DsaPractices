class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 4, 5};
        boolean containsDuplicate1 = solution.containsDuplicate(nums1);
        System.out.println(containsDuplicate1);

    }
}
