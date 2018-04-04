package me.epicgeek.leetcode.easy.string;

public class StrStr {
	public static void main(String[] args) {
		System.out.println(strStr("mississippi","issipi"));
		
	}
	// https://leetcode-cn.com/problems/implement-strstr/description/
    public static int strStr(String haystack, String needle) {
    	if(haystack == null || needle == null || (needle.length() > haystack.length()) || !haystack.contains(needle))  
            return -1;
    	if(haystack.equals(needle) || needle.length() ==0) 
            return 0;

        char[] haystackArray= haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for(int i = 0 ; i < haystackArray.length ; i++) {
        	if(haystackArray[i] == needleArray[0]) {
        		String cut = haystack.substring(i,i+needle.length());
        		if(cut.equals(needle)) {
        			return i;
        		}else {
        			continue;
        		}
        	}else {
        		continue;
        	}
        }
        return -1;}
}

