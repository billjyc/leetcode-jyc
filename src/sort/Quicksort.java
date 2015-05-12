package sort;

public class Quicksort {
	public void quickSort(int[] num, int start, int end) {
		if(start < end) {
			int pivot = num[start];
			int low = start;
			int high = end;
			while(low < high) {
				while((num[high] > pivot) && (low < high)) {
					high--;
				}
				num[low] = num[high];
				while((num[low] <= pivot) && (low < high)) {
					low++;
				}
				num[high] = num[low];
			}
			num[low] = pivot;
			quickSort(num, start, low-1);
			quickSort(num, low + 1, end);
		}
	}
}
