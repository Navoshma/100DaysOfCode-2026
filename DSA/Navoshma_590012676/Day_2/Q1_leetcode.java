public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++; 
            }
        }
        
        return k; 
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int result1 = removeElement(nums1, val1);
        System.out.println("Remaining count: " + result1); 

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int result2 = removeElement(nums2, val2);
        System.out.println("Remaining count: " + result2); 
    }
}
# Day 2