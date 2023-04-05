class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
    
        for(int i=nums2.length-1; i>=0; i--){
            boolean flag = true;
            while(!s.isEmpty() && flag)
            {
                if(s.peek() > nums2[i]){
                    hm.put(nums2[i],s.peek());
                    flag = false;
                }
                else
                    s.pop();
            }
            if(s.isEmpty()){
                hm.put(nums2[i],-1);
            }

            s.push(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++){
            nums1[i] = hm.get(nums1[i]);
        }

        return nums1;
    }
}
