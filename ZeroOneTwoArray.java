
public class ZeroOneTwoArray {
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void sort(int[] arr) {
		int length = arr.length;
		int low = 0, mid = 0, high = length-1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			}
			else if (arr[mid] == 2) {
				swap(arr, mid, high);
				high--;
			}
			else {
				mid++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
