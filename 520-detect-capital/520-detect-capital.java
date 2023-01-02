//Question Link - https://leetcode.com/problems/detect-capital/description/

class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1)
            return true;

        boolean flag = Character.isUpperCase(word.charAt(1));
        
        for(int i=1; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch) != flag){
                return false;
            }
        }

        boolean first = Character.isUpperCase(word.charAt(0));
        if(first || first==flag)
            return true;

        return false;
    }
}
