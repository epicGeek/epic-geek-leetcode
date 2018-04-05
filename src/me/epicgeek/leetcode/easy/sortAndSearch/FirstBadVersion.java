package me.epicgeek.leetcode.easy.sortAndSearch;

public class FirstBadVersion {
	public static void main(String[] args) {
		System.out.println(((long)1063376695+(long)2126753390)/2);
	}
	// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/8/sorting-and-searching/53/
    public int firstBadVersion(int n) { //TODO 
    	error!
    	if( n == 1) {
    		if(isBadVersion(n)) {
    			return 1;
    		}
    	}
    	if( n == 2) {
    		if(isBadVersion(1)) {
    			return 1;
    		}else {
    			return 2;
    		}
    	}
        long pointer = n / 2 ;
        System.out.println("pointer is  :"+ pointer);
        boolean isItBad = isBadVersion((int)pointer);
        System.out.println("is pointer:"+pointer+" bad?  " + isItBad);
        if(isItBad) {
        	// Middle version is bad.Bad version must be it or at front.
        	System.out.println("pointer:"+pointer+" is bad! Bad version must be it or at front.");
        	if((pointer - 1) == 0) {
        		return 1;
        	}
        	isItBad = isBadVersion((int)pointer - 1);
        	System.out.println("is front one :"+(pointer - 1)+" bad?  " + isItBad);
        	if (!isItBad) {
        		System.out.println("front one :"+(pointer - 1)+" not bad." + pointer + "is bad.Get the bad version:"+pointer);
        		return (int)pointer;
        	}
        	pointer = (1+pointer)/2;
        	System.out.println("search first half : 1 - "+(1+pointer)/2);
        	return firstBadVersion((1+(int)pointer)/2);
        }else {
        	// Middle version is good.Bad version must be at back.
        	System.out.println("Pointer:"+pointer+" is good! Bad version must be at back.");
        	pointer = (pointer+n)/2;
        	System.out.println("Go to search:"+pointer);
        	return firstBadVersion((int)pointer);
        }
    }
    
    boolean isBadVersion(int version) {
    	return false;
    };
}
