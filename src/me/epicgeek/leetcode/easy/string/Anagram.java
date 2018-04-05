package me.epicgeek.leetcode.easy.string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("anagrams","nagaram"));
	}
	// https://leetcode-cn.com/problems/valid-anagram/description/
    public static boolean isAnagram(String s, String t) {
    	if(s == null || t == null) return false;
    	if(s.length() != t.length()) return false;
    	if(s.equals(t))  return true;
		Map<Character,Integer> cMapS = new HashMap<>(); 
		Map<Character,Integer> cMapT = new HashMap<>();
		char[] sA = s.toCharArray();
		char[] tA = t.toCharArray();
		for (int i = 0 ; i < s.length() ; i++) {
			putInMap(cMapS , sA[i]);
			putInMap(cMapT , tA[i]);
		}
		return cMapS.equals(cMapT);
    }
    
    public static void putInMap(Map<Character,Integer> cMap , char tA) {
    	if(cMap.containsKey(tA)) {
    		Integer i = cMap.get(tA) + 1;
    		cMap.put(tA, i);
    	}else {
    		cMap.put(tA, 0);
    	}
    }
}
