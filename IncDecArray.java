
public class IncDecArray {

	public static int findMaximum(int [] array, int start, int end) {
		if (start == end) {
			return array[start];
		}
		if (end == start + 1) {
			if (array[start] > array[end]) {
				return array[start];
			} else {
				return array[end];
			}
		}
		int mid = (start + end) / 2;
		if (array[mid-1] < array[mid] && array[mid] < array[mid+1])
			return findMaximum(array, mid+1, end);
		else if (array[mid-1] > array[mid] && array[mid] > array[mid+1])
			return findMaximum(array, start, mid-1);
		else
			return array[mid];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[] {6, 9, 15, 25, 35, 50, 41, 29, 23, 8};
		int length = array.length;
		int result = findMaximum(array, 0, length-1);
		System.out.println(result);
	}

}
