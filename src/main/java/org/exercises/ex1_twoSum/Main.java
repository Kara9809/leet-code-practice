package org.exercises.ex1_twoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSumEx1 solution1 = new TwoSumEx1();
        int[] nums = {2,7,11,15};
        int target = 18;
        int[] result = solution1.twoSum(nums, target);
        System.out.println("Indices of numbers that sum to target: "+ Arrays.toString(result));
    }
}