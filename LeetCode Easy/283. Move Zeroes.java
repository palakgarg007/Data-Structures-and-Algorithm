class Solution {
    public void moveZeroes(int[] nums) {
        int pointer = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        for(int i=pointer; i<n; i++)
            nums[i] = 0;
    }
}
