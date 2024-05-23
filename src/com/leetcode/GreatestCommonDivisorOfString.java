package com.leetcode;

//For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//Example 1:
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"

public class GreatestCommonDivisorOfString {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        int gcdLength = gcd(str1.length(), str2.length());
        String candidate = str1.substring(0, gcdLength);
        return (isDivisible(str1, candidate) && isDivisible(str2, candidate)) ? candidate : "";
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static boolean isDivisible(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        return lenS % lenT == 0 && s.equals(t.repeat(lenS / lenT));
    }

}
