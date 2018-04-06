package me.epicgeek.leetcode.easy.array;

public class RotateArray {
	public static void main(String[] args) {
		rotate1(new int[] {1,2,3,4,5,6,7}, 3);
	}
	// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
    public static void rotate1(int[] nums, int k) {
        int flag = 1;
        while(flag <= k) {
        	int innerFlag = 1;
        	int j = nums.length-1;
        	while(innerFlag <= j) {
        		nums = swap(nums,0,innerFlag);
        		innerFlag++;
        	}
        	flag++;
        }
    }
    public static void rotate2(int[] nums, int k) {
        //TODO
    }
    public static void rotate3(int[] nums, int k) {
    	//TODO
    }
    public static int[] swap(int[] array ,int index1 , int index2) {
    	int temp = array[index1];
    	array[index1] = array[index2];
    	array[index2] = temp;
    	return array;
    }
}
