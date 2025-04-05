package org.programmingskills_leetcode;

public class MergeStringsAlternatively {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder output = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());
        boolean isWord1Big = false;
        for(int i = 0;i<minLength;i++){
            output.append(word1.charAt(i));
            output.append(word2.charAt(i));
        }
        isWord1Big = word1.length() > word2.length() ? true : false;
        if(isWord1Big)
            output.append(word1.substring(minLength));
        else
            output.append(word2.substring(minLength));

        return output.toString();

    }

}
