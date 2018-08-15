package lib;

public class KarateKata {
	
	// binary chop
	// find the position of value  in sorted array of values
	// Multiple passes - first if value is in top or bottom half in list
	// next only consider the chosen half, next halve again
	// stop when no more array or value is found
	
	public static int[] chop(int inputInteger, int[] intArray) {
		
		int totalLength = intArray.length;
		
		int mid = totalLength / 2;
		int[] result = {-1, 0};
		
		// add loop for array search
		
		// 1st half
		for(int i = 0; i < mid; i ++) {
			if(intArray[i] == inputInteger) {
				result[0] = 1;
				result[1] = i;
				return result;
			}
		}
		
		//2nd half
		for(int i = totalLength; i > mid; i --) {
			if(intArray[i] == inputInteger) {
				result[0] = 1;
				result[1] = i;
				return result;
			}
		}
		
		
		return result;

	}
}
