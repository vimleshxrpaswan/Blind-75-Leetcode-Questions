package com.leetcode;

//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional letters onto the end of the merged string.
//Return the merged string.
//Example 1:
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r

import java.util.Arrays;

public class UniquePathsFinder {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());
        char[] charArray = word1.toCharArray();
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                mergedString.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                mergedString.append(word2.charAt(i));
            }
        }
        return mergedString.toString();
    }

}
