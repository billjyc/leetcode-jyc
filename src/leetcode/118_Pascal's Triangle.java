package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleI {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(numRows < 1) {
			return list;
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list.add(list2);

		for(int i = 1; i< numRows; i++) {
			ArrayList<Integer> elem2 = new ArrayList<Integer>();
			for(int j = 0; j < i; j++) {
				if (j == 0) 
					elem2.add(1) ;
				else 
					elem2.add(list2.get(j) + list2.get(j-1));
			}
			elem2.add(1);
			list.add(elem2);
			list2 = elem2;
		}
		return list;
	}
}
