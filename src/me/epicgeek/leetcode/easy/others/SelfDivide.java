package me.epicgeek.leetcode.easy.others;

import java.util.ArrayList;
import java.util.List;

public class SelfDivide {
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1,22));
	}
	// https://leetcode-cn.com/problems/self-dividing-numbers/description/
    public static List<Integer> selfDividingNumbers(int left, int right) {
    	List<Integer> selfDividingNumbers = new ArrayList<>();
        for(int i = left ; i <= right ; i ++) {
        	List<Integer> everyNumber = getEveryNumber(i);
        	if(everyNumber.contains(0)) {
        		continue;
        	}
        	if(isSelfDivided(everyNumber,i)) {
        		selfDividingNumbers.add(i);
        	}
        }
        return selfDividingNumbers;
    }
	private static List<Integer> getEveryNumber(int num) {
		List<Integer> getEveryNumber = new ArrayList<>(); 
		while(num != 0) {
			int t = num % 10;
			if(num != 0) {
				if(!getEveryNumber.contains(t)) {
					getEveryNumber.add(t);
				}
				num = num / 10;
			}
		}
		return getEveryNumber ;
	}
	private static boolean isSelfDivided(List<Integer> everyNumber , int self) {
		for (Integer integer : everyNumber) {
			if(self % integer != 0) {
				return false;
			}else {
				continue;
			}
		}
		return true;
	}
}
