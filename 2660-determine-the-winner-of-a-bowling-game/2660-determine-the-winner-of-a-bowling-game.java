class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int count1=0, count2=0;
        int sum1=0, sum2=0;

        for(int i=0; i<player1.length; i++){
            if(count1 > 0){
                sum1 = sum1 + (2*player1[i]);
                count1--;
            }
            else{
                sum1 += player1[i];
            }

            if(count2 > 0){
                sum2 = sum2 + (2*player2[i]);
                count2--;
            }
            else{
                sum2 += player2[i];
            }

            if(player1[i] == 10)
                count1 = 2;
            
            if(player2[i] == 10)
                count2 = 2;
                
        }

        if(sum1 > sum2)
            return 1;
        else if(sum2 > sum1)
            return 2;
        else 
            return 0;
    }
}
