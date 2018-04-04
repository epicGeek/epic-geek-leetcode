package me.epicgeek.leetcode.easy.string;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {
				"aa","aa"
		}));
	}
	// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/40/
	public static String longestCommonPrefix(String[] strs) {
		String cut = "";
		String ans = "";
		for (int i = 0; i <= strs.length; i++) {
			int flag = 0;  //TODO PROBLEM here!!!!
			cut = strs[0].substring(0, flag);
			System.out.println("cut is :"+cut);
			System.out.println("i is :"+i);
			if (!strs[i].startsWith(cut)) {
				System.out.println(strs[i]+"is not start with "+cut +",return "+ans);
				return ans;
			}
			if (i == strs.length - 1) {
				System.out.println("Got last str.");
				flag++;
				System.out.println("flag add as:"+flag);
				ans = cut;
				System.out.println("ans updated as :"+ans);
				i = 0;
			}
		}
		return ans;
	}
}
