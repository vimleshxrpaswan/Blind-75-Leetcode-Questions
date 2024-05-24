package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidWithCandies {


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies)
            maxCandies = Math.max(maxCandies, candy);

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies)
            result.add(candy + extraCandies >= maxCandies);

        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        kidsWithCandies(candies, extraCandies);

        for (
                Boolean b : result)
            System.out.print(b + " ");
    }


}
