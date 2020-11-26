
public class MergeSort {
	
	public static void merge(int [] arr, int [] result, int low, int mid, int high) {
		int i = low, k = low, j = mid + 1;
		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				result[k++] = arr[i++];
			} else {
				result[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			result[k++] = arr[i++];
		}
		while (j <= high) {
			result[k++] = arr[j++];
		}
		for (i = low;i <= high; i++) {
			arr[i] = result[i];
		}
	}
	
	public static void mergeSort(int [] arr, int [] result, int low, int high) {
		if (low == high)
			return;
		int mid = (low + high) / 2;
		mergeSort(arr, result, low, mid);
		mergeSort(arr, result, mid+1, high);
		merge(arr, result, low, mid, high);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {8, 4, 3, 12, 25, 6, 13, 10};
		int length = arr.length;
		int result[] = new int[length];
		
		mergeSort(arr, result, 0, length-1);
		for (int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
