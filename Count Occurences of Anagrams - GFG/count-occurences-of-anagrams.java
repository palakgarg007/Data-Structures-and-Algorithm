//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int[] occurrence = new int[26];
        
        for(int i =0; i<pat.length(); i++){
            int index = pat.charAt(i) - 97;
            occurrence[index]++;
        }
        
        int i=0, j=0, count=0;
        
        while(j < txt.length()){
            occurrence[txt.charAt(j)-97]--;
            
            if(j-i+1 == pat.length()){
                boolean flag = true;
                for(int k=0; k<26; k++){
                    if(occurrence[k] != 0)
                        flag = false;
                }
                if(flag)
                    count++;
                
                occurrence[txt.charAt(i)-97]++;
                i++;
            }
            j++;
        }
        return count;
    }
}