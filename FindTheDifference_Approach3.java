package org.programmingskills_leetcode;

public class FindTheDifference_Approach3 {

    public char findTheDifference(String s, String t) {
        //Time Complexity : O( N + M ) where N stands for the length of String s and M stands for length of String t.
        // , Space Complexity : O(1)
        char output = 0;
        for(int i = 0;i<s.length();i++)
            output = (char)(output ^ s.charAt(i));
        for(int i = 0;i<t.length();i++)
            output = (char)(output ^ t.charAt(i));
        return output;
    }


}
