class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for(int i=0; i<spaces.length; i++){
            int idx = spaces[i] + count++;
            sb.insert(idx," ");
        }
        return sb.toString();
    }
}
