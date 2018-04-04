package me.epicgeek.leetcode.easy.array;

public class TwoSum {
	public static void main(String[] args) {
		
	}
	// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/29/
    public int[] twoSum(int[] nums, int target) {
        int[] sumIndex = new int[2];
        for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					sumIndex[0] = i;
					sumIndex[1] = j;
				}
			}
		}
        return sumIndex;
    }
}
