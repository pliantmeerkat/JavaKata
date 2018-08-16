package lib;

import java.util.ArrayList;

public class KarateKata {
	
	// binary chop
	// find the position of value  in sorted array of values
	// Multiple passes - first if value is in top or bottom half in list
	// next only consider the chosen half, next halve again
	// stop when no more array or value is found
	// see KarateKata_test for results
	
	// runs from front to end
	public static int chop1(int inputInteger, ArrayList<Integer> intArray) {
		
		int totalLength = intArray.size();
		int result = -1;
		for(int i = 0; i <totalLength; i ++) {
			if(intArray.get(i) == inputInteger) {
				result = i;
				return result;
			}
		}
		return result;
	}
	
	// runs from mid to front, mid to back
	public static int chop2(int inputInteger, ArrayList<Integer> intArray) {
		int result = -1;
		int totalLength = intArray.size();
		int mid = totalLength/2;
		//first half
		for(int i = mid; i > 0; i --) {
			if(intArray.get(i) == inputInteger) {
				return i;
			}
		}
		for(int i = mid; i < totalLength; i ++) {
			if(intArray.get(i) == inputInteger) {
				return i;
			}
		}
		return result;
	}
	
	// Chooses which end to search based on size of inputInt and uses above method
	public static int chop3(int inputInteger, ArrayList<Integer> intArray) {
		int end = intArray.size();
		int mid = end / 2;
		int start = 0;
		if(inputInteger > mid) {
			start = mid ;
		}
		for(int i = start; i < end - (50 - start); i ++) {
			if(intArray.get(i) == inputInteger) {
				return i;
			}
		}
		return -1;
	}
	// calculates how much bigger last value is than input, uses this to set start position
	public static int chop4(int inputInteger, ArrayList<Integer> intArray) {
		int length = intArray.size();
		float ratio = (intArray.get(length - 1) *100/ inputInteger) ; 
		int startPos = Math.round(length / (ratio / 100));
		System.out.println(startPos);
		for(int i = startPos; i > 0; i --) {
			if(intArray.get(i) == inputInteger) {
				return i;
			}
		}
		// in case 1st missed
		for(int i = 0; i < startPos; i ++) {
			if(intArray.get(i) == inputInteger) {
				return i;
			}
		}
		return -1;
	}
}
