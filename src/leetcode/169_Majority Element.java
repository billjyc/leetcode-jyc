package leetcode;

/**
 * 169
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * @author soft
 *
 */
public class MajorityElement {
	public int majorityElement(int[] num) {
		if(num.length == 0) {
			return 0;
		}
		int count = 1;
		int majority_number = num[0];
		for(int i = 1; i < num.length; i++) {
			if(num[i] == majority_number) {
				count++;
			} else if (count == 0) {
				majority_number = num[i];
			} else {
				count --;
			}
		}
		return majority_number;
	}
}
