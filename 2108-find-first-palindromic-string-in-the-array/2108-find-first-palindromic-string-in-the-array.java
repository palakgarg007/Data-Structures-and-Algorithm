    class Solution {
    public String firstPalindrome(String[] words) {
        outer:
        for(String str:words){
            int i=0;
            int j=str.length()-1;
            while(i<j){
                if(str.charAt(i) == str.charAt(j)){
                    i++;
                    j--;
                }
                else
                    continue outer;
            }
            return str;
        }

        return "";
    }
}
