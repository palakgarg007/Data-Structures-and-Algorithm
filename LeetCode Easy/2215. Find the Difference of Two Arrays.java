class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> alist = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums1.length; i++){
            map.put(nums1[i],0);
        }

        for(int i:nums2){
            if(map.containsKey(i)){
                map.put(i,-1);
            }
            else if(!a2.contains(i))    
                a2.add(i);
        }

        for(HashMap.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() == 0)
                a1.add(m.getKey());
        }

        alist.add(a1);
        alist.add(a2);
        return alist;
    }
}
