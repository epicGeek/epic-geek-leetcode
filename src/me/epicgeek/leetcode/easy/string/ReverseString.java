package me.epicgeek.leetcode.easy.string;

import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(getReverseString("hello"));
		System.out.println(getReverseString2("hello"));
	}

	// https://leetcode-cn.com/problems/reverse-string/description/
	private static String getReverseString(String str) {  
		char[] ca = str.toCharArray(); 
		Stack<Character> stack = new Stack<Character>(); // use stack
		for (char c : ca) {
			stack.push(c);
		}
		StringBuilder sb = new StringBuilder();
		while (stack.size() != 0) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}
	
	private static String getReverseString2(String str) {
		char[] ca = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = ca.length - 1; i>=0 ;i--) {
			sb.append(ca[i]);
		}
		return sb.toString();
	}
}
