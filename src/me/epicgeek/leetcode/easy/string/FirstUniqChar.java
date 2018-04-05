package me.epicgeek.leetcode.easy.string;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqChar {
	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
    public static int firstUniqChar(String s) {
        char[] charArray = s.toCharArray();
        Map<Character,List<Integer>> map = new LinkedHashMap<>();
        for (int i = 0 ; i < charArray.length ; i++) {
        	if(map.containsKey(charArray[i])) {
        		List<Integer> list = map.get(charArray[i]);
        		list.add(i);
        	}else {
        		List<Integer> list = new ArrayList<>();
        		list.add(i);
        		map.put(charArray[i], list);
        	}
        }
        
        for (Character c : map.keySet()) {
			if(map.get(c).size() == 1) {
				return map.get(c).get(0);
			}
		}
        return -1;
    }
}
