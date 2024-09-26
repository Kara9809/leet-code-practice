package org.exercises;

import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers
// such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class TwoSumEx1 {
    public int[] twoSum(int[] nums, int target) {
        //Create a hash map to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        //Loop through all elements in the array
        for (int i = 0; i < nums.length; i++) {
            //Calculate the complement that needs to be found (target - current number)
            int complement = target - nums[i];
            //If the complement exist in the hash, return the indices
            if (map.containsKey(complement)) {
                return new int[]{
                        map.get(complement), i
                };
            }
            //if not found store the current number snd its index in the map
            map.put(nums[i], i);
        }
        //return an empty array if no solution is found - default
        return new int[]{
        };
    }
}

