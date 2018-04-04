package me.epicgeek.leetcode.easy.array;

public class SingleNumber {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {1,2,3,3,1,2,6}));
	}
	// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/
    public static int singleNumber(int[] nums) {
    	int single = nums[0];
    	for (int i = 1 ; i < nums.length ; i++) {
			single = single ^ nums[i];
		}
    	return single;
    }
}
