public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int res[] = new int[2];
        int max = a[0];
        int min = a[0];
        int smax = Integer.MIN_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            if(max<a[i]){
                smax = max;
                max = a[i];
            }
            else if(a[i]<max && a[i]>smax)
                smax = a[i];

            if(min > a[i]){
                smin = min;
                min = a[i];
            }
            else if(a[i]>min && a[i]<smin)
                smin = a[i];
        }
        res[0] = smax;
        res[1] = smin;
        return res;
    }
}
