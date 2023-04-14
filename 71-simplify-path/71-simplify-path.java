class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String temp = "";
        String str = "";

        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == '/')
                continue;
            
            while(i<path.length() && path.charAt(i) != '/'){
                temp += path.charAt(i);
                i++;
            }

            if(temp.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else if(!temp.equals("."))
                stack.push(temp);
            
            temp = "";
        }

        if(stack.isEmpty())
            return "/";

        while(!stack.isEmpty())
            str = "/" + stack.pop() + str;
        
        return str;
    }
}
