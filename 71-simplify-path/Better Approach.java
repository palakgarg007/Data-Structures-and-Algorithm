class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>(); 
        String[] directories = path.split("/"); // split the path by slash '/'
        for (String dir : directories) {
            // ignore the current directory '.' and empty directories
            if (dir.equals(".") || dir.isEmpty()) { 
                continue;
            } else if (dir.equals("..")) { 
                if (!stack.isEmpty()) { 
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        
        return "/" + String.join("/", stack); 
    }
}
