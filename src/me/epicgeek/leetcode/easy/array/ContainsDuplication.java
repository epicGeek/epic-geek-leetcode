package me.epicgeek.leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplication {
	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,3}));
	}
	// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length==0) return false;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(set.size() != i+1){
                return true;
            }
        }
        return false;
    }
}
