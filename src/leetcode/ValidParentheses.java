package leetcode;

import java.util.Stack;

/**
 * 20
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * The brackets must close in the correct order, 
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * @author soft
 *
 */
public class ValidParentheses {
	 public boolean isValid(String s) {
		 if(s == null || s.length() == 0) {
			 return false;
		 }
		 
		 Stack<Character> stack = new Stack<Character>();
		 //process s char by char
		 for(char c : s.toCharArray()) {
			 if(c == '(' || c == '[' || c == '{') {
				 stack.push(c);
			 } else {
				 if(stack.isEmpty()) {
					 return false;
				 }
				 char pop = stack.pop();
				 //判断符号是否匹配
				 if(Math.abs(pop - c) > 2) {
					 return false;
				 }
			 }
		 }
		 return stack.isEmpty();
	 }
}
