class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index = 1;
        int value = nums[0];
        
        if (nums.length == 1) {
            return index;
        }

        for (int i = 1; i < nums.length; i++) {
            if (value < nums[i]) {
                nums[index] = nums[i];
                index++;
                value = nums[i];
            }
        }

        return index; 
    }

}