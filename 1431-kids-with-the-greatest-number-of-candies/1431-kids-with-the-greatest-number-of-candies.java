class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i:candies){
            if(i>max)
                max = i;
        }

        for(int i:candies)
            list.add(i+extraCandies >= max);

        return list;
    }
}
