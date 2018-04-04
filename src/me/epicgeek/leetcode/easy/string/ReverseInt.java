package me.epicgeek.leetcode.easy.string;

public class ReverseInt {
	//https://leetcode-cn.com/problems/reverse-integer/description/
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		
	}
    public static int reverse(int x) {
    	if(x ==0) return 0;
        	boolean positive = true;
        	if(x<0) {
        		positive = false;
        	}
        	String s ;
        	if(!positive) {
        		s = String.valueOf(x).substring(1);
        	}else {
        		s = String.valueOf(x);
        	}
        	char[] cArray = s.toCharArray();
        	StringBuilder sb = new StringBuilder();
        	boolean realStartFlag = false;
        	for(int i=cArray.length-1 ; i>=0 ; i--) {
        		if(!realStartFlag) {
            		if(cArray[i] != '0') {
            			realStartFlag = true;
            		}else {
            			continue;
            		}		
        		}
        		if(realStartFlag){
            		sb.append(cArray[i]);
        		}

        	}
        	try {
        		int absReversed = Integer.valueOf(sb.toString());
        		return positive?absReversed:(-1 * absReversed);
			} catch (NumberFormatException e) {
				return 0;
			}
    }
}
