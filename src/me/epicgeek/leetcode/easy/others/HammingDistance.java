package me.epicgeek.leetcode.easy.others;

public class HammingDistance {
	public static void main(String[] args) {
		
	}
    public int hammingDistance(int x, int y) {
    	int count = 0;
    	for(int i = 31;i >= 0; i--) {
    		if((x >>> i & 1) != (y >>> i & 1)) {
    			count ++;
    		}
    	}
    	return count ;
    }
}
