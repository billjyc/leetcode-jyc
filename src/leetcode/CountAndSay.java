package leetcode;

/**
 * 38
 * Given an integer n, generate the nth sequence.
 * @author soft
 *
 */
public class CountAndSay {
	public String countAndSay(int n) {
		if(n <= 0)
			return null;
		String s = "1";
		for (int i = 1; i< n; i++) {
			char[] c = s.toCharArray();
			//System.out.println(c.length);
			int count = 1; 
			String temp = "";
			for(int j = 1; j< c.length; j++) {
				if(c[j] == c[j-1]) {
					count ++;
				} else {
					temp = temp + count + c[j-1];
					count = 1;
				}
			}
			s = temp + count + c[c.length-1];
			System.out.println(s);
		}
		return s;
	}
}
