class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
        int i = 0;
        while (i<m || i<n) {
            if (i < m)
                sb.append(word1.charAt(i));

            if (i < n) 
                sb.append(word2.charAt(i));
            
            i++;
        }
        return sb.toString();
    }
}
