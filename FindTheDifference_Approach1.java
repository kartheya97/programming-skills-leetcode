package org.programmingskills_leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference_Approach1 {

    public char findTheDifference(String s, String t) {

        //Time Complexity : O( N + M ) Where N and M stands for length of String S and T respectively
        //Space Complexity : O(1)
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        for(int i = 0;i<t.length();i++)
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        for(Map.Entry<Character, Integer> entry : map.entrySet())
            if(entry.getValue() != 0)
                return entry.getKey();
        return '\u0000';

    }


}
