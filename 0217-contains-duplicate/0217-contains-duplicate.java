import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
       // Sort the array
        Arrays.sort(nums);

        //check adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // duplicate found
            }
        }

      //If no duplicates found
        return false;
    }
}
