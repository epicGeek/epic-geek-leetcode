package me.epicgeek.leetcode.easy.others;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
	// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/26/others/67/
    public static List<List<Integer>> generate(int numRows) {

    	List<Integer> list1 = new ArrayList<>();
    	list1.add(1);
    	List<Integer> list2 = new ArrayList<>();
    	list2.add(1);
    	list2.add(1);
        if(numRows == 0) {
        	return new ArrayList<>();
        }
        else if(numRows == 1) {
        	List<List<Integer>> lists = new ArrayList<>();
        	lists.add(list1);
        	return lists;
        }
        else if(numRows == 2) {
        	List<List<Integer>> lists = new ArrayList<>();
        	lists.add(list1);
        	lists.add(list2);
        	return lists;
        }
        else{
        	List<List<Integer>> lists = new ArrayList<>();
        	lists.add(list1);
        	lists.add(list2);
        	int flag = 3;
        	while(flag <= numRows) {
        		List<Integer> newList = getNewList(lists,flag);
        		lists.add(newList);
        		flag++;
        	}
        	return lists;
        }
    }      
	private static List<Integer> getNewList(List<List<Integer>> lists,int row) {
		List<Integer> lastLine = lists.get(row-2);
		List<Integer> newLine = new ArrayList<>();
		newLine.add(1);
		for(int i = 2 ;i < row ; i++) {
			newLine.add(lastLine.get(i-2)+lastLine.get(i-1));
		}
		newLine.add(1);
		System.out.println("row:"+row );
		System.out.println("line:"+newLine );
		return newLine;
	}
}
