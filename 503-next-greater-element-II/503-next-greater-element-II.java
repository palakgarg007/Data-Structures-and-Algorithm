class Solution {
    static int next(int[] nums, int i, Stack<Integer> s){
        while(!s.isEmpty()){
            if(s.peek()>nums[i]){
                return s.peek();
            }
            else
                s.pop();
        }
        return -1;
    }

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();

        int max=0;
        for(int i=1; i<n; i++){
            if(nums[i]>nums[max])
                max=i;
        }

        for(int i=max; i>=0; i--){
            ans[i] = next(nums, i, s);
            s.push(nums[i]);
        }

        for(int i=n-1; i>max; i--){
            ans[i] = next(nums, i, s);
            s.push(nums[i]);
        }

        return ans;
    }
}
