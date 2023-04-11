class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                stack.push(ch);
            else{
                stack.pop();
            }
        }

        while(!stack.isEmpty()){
            str.insert(0,stack.pop());
        }

        return str.toString();
    }
}
