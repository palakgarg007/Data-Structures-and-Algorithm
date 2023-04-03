class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0;
        int j = people.length-1;
        int count = 0;
        Arrays.sort(people);
        while(i<j){
            int sum = people[i] + people[j];
            if(sum <= limit){
                i++;
                j--;
            }
            else if(sum > limit)
                j--;
            
            count++;
        }
        if(i==j)
            count++;
        
        return count;
    }
}
