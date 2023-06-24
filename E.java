import java.util.Arrays;

public class E {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;
        for (int j = 0; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);


        for (int num : nums1) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        E solution = new E();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);
    }
}
