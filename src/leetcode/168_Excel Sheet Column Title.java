package leetcode;

import java.util.StringTokenizer;

/**
 * 168
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * @author soft
 *
 */
public class ExcelSheetColumnTitle {
	 public String convertToTitle(int n) {
		 if(n <= 0) {
			 return null;
		 }
		 String result = "";
		 String each_digit = "";
		 while (n > 0) {
			 int digit = n%26;
			 if(digit == 0) {
				 digit = 26;
			 }
			 char digit_c = (char) ('A' + (digit - 1));
			 each_digit = String.valueOf(digit_c);
			 result = each_digit + result;
			 n = (n - 1) / 26;
		 }
		 return result;
	 }
}
