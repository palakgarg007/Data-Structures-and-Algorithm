class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        String words[] = s.split("\\s+");
        
        for(int i = words.length-1; i>0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        sb.append(words[0]);
        return sb.toString();
    }
}
