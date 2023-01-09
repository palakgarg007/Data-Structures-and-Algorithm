//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        int occurence[] = new int[26];
        
        for(int i=0; i<S.length(); i++){
            int index = S.charAt(i) - 97;
            occurence[index]++;
        }
        
        for(int i=0; i<S.length(); i++){
            int index = S.charAt(i) - 97;
            if(occurence[index] == 1)
                return S.charAt(i);
        }
        
        return '$';
    }
}

