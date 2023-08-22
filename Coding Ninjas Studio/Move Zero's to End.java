public class Solution {
        public static int[] moveZeros(int n, int []a) {
            int pointer = n;

            for(int i=0; i<n; i++){
                if(a[i] == 0){
                    pointer = i;
                    break;
                }
            }

            for(int i=pointer+1; i<n; i++){
                if(a[i] != 0){
                    a[pointer] = a[i];
                    a[i] = 0;
                    pointer++;
                }
            }

            return a;
    }
}
