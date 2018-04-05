package me.epicgeek.leetcode.easy.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	// https://leetcode-cn.com/problems/fizz-buzz/description/
	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}

	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if(i%15 == 0) {
				list.add("FizzBuzz");
				continue;
			}else if(i%5 == 0) {
				list.add("Buzz");
				continue;
			}else if(i%3 == 0) {
				list.add("Fizz");
				continue;
			}else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}
}
