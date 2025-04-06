package org.programmingskills_leetcode;

public class FindTheDifference_Approach2 {

    public char findTheDifference(String s, String t) {
        //Time Complexity : O( N + M ) Where N and M stands for Length of Strings s and T respectively.
        // and Space Complexity : O(1)
        int frequency[] = new int[26];
        for(int i = 0;i<t.length();i++)
            frequency[t.charAt(i) - 'a'] += 1;
        for(int i = 0;i<s.length();i++)
            frequency[s.charAt(i) - 'a'] -= 1;
        for(int i = 0;i<frequency.length;i++)
            if(frequency[i] > 0)
                return (char)(i + 'a');
        return '\u0000';
    }

}
