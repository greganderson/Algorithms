public class BinarySearch {

	public static void main(String[] args) {
		
	}

	public int binarySearch(int[] sorted, int search) {
		int start = 0;
		int end = sorted.length - 1;
		int mid = sorted.length / 2;
		return recurse(sorted, search, start, mid, end);
	}

	private int recurse(int[] sorted, int search, int start, int mid, int end) {
		// Base case
		if (start > end)
			return -1;

		if (sorted[mid] == search) {
			return mid;   
		}
		else {
			if (sorted[mid] < search) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			mid = ((end - start) / 2) + start;
			return recurse(sorted, search, start, mid, end);
		}
	}
}
