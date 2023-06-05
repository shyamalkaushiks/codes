public class a {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        
        // Move all non-zero elements to the left side
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }
        
        // Fill the remaining positions with zeros
        while (left < n) {
            nums[left] = 0;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
