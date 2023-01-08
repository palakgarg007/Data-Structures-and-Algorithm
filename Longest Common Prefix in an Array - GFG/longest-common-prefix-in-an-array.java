//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        int min = arr[0].length();
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<n; i++){
            if(arr[i].length() < min)
                min = arr[i].length();
        }
        outer:
        for(int i=0; i<min; i++){
            char ch = arr[0].charAt(i);
            inner:
            for(int j=1; j<n; j++){
                if(arr[j].charAt(i) != ch)
                    break outer;
            }
            sb.append(ch);
        }
        
        if(sb.toString().isEmpty())
            return "-1";
        else 
            return sb.toString();
    }
}