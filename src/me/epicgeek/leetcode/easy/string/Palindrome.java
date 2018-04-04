package me.epicgeek.leetcode.easy.string;

import java.util.Stack;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("alola"));
		System.out.println(isPalindrome("alolas"));
	}
	// https://leetcode-cn.com/problems/valid-palindrome/description/
    public static boolean isPalindrome(String s) {

        if(s == null) return false;
        if(s.equals("")) return true;
        char[] array = s.toCharArray();
        for (int i = 0;i<array.length;i++) {
        	int ci = (int)array[i];
			boolean charIsNumber = ci >=48 && ci <= 57;
			boolean charIsLowerCase = ci >= 97 && ci <= 122;
			boolean charIsUpperCase = ci >= 65 && ci <= 90;
			if(!charIsNumber && !charIsLowerCase && !charIsUpperCase) {
				array[i] = '.';
			}
		}
        String filteredStr = new String(array).replaceAll("\\.", "").toLowerCase();;
        String reversedStr = reverseStr(filteredStr);
        return filteredStr.equals(reversedStr);
	
        
    }
    	private static String reverseStr(String reversedStr) {  
		char[] ca = reversedStr.toCharArray(); 
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
}
