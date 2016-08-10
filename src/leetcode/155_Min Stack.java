package leetcode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 155
 *  Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

 * @author soft
 *
 */
public class MinStack {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	public void push(int x) {
		stack.push(x);
		if(minStack.isEmpty() || (x <= minStack.peek() && !minStack.isEmpty())) {
			minStack.push(x);
		}
	}

	public void pop() {
		if(!stack.isEmpty()) {
			if(stack.peek().equals(minStack.peek())) {
				minStack.pop();
			}
			stack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
