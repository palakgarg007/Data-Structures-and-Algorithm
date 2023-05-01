class Solution {
    public double average(int[] salary) {
        double res = 0;
        int min = salary[0];
        int max = salary[0];

        for(int i=0; i<salary.length; i++){
            res += salary[i];
            if(min > salary[i])
                min = salary[i];
            
            if(max < salary[i])
                max = salary[i];
        }

        res = res - (min+max);
        res = res/(salary.length - 2);
        return res;
    }
}
