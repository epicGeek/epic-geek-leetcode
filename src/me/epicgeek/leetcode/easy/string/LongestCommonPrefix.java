package me.epicgeek.leetcode.easy.string;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {
				"aa","aab"
		}));
	}
	// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/40/
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
		int pointer = 0;
		String ans = "";
		int minLen = getMinLen(strs);
		while(pointer <= minLen) {
			String cutter = strs[0].substring(0, pointer);
			if(allStartsWithCutter(cutter,strs)) {
				ans = cutter;
				pointer ++;
			}else {
				return ans;
			}
		}

		return ans;
	}
	private static int getMinLen(String[] strs) {
		int minLen = strs[0].length();
		for (String string : strs) {
			if(string.length()<minLen) {
				minLen = string.length();
			}
		}
		return minLen;
	}
	private static boolean allStartsWithCutter(String cutter, String[] strs) {
		for (String string : strs) {
			if(!string.startsWith(cutter)) {
				return false;
			}
		}
		return true;
	}
}
