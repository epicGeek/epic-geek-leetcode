package me.epicgeek.leetcode.easy.math;

public class CountPrimes {
	public static void main(String[] args) {
		System.out.println(countPrimes(499979));   // TODO Too long time.
	}
    public static int countPrimes(int n) {
    	int count = 0;
    	if (n == 0 || n == 1) return count ;
    	if(n == 2) return 0;
        for (int i = 2; i < n; i++) {
			if(!isComposite(i)) {
				System.out.println(i + " is prime");
				count ++;
			}else {
				continue;
			}
		}
        return count;
    }
    public static boolean isComposite(int n) {
    	if( n <= 1) { 
    		return false;
    	}
    	for (int i = 2; i < n; i++) {
			if( n%i == 0) {
				return true;
			}
		}
    	return false;
    }
}
