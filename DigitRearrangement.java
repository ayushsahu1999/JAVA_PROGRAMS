import java.util.Arrays;

public class DigitRearrangement {
	
	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void NextMore(int[] array) {
		int n = array.length;
		int i;
		for (i=n-1;i>0;i--) {
			if (array[i-1]<array[i])
				break;
		}
		
		int element = i-1, min = i;
		for (int j = i+1; j < n; j++) {
			if (array[j] > array[element] && array[j] < array[min]) {
				min = j;
			}
		}
		
		swap(array, element, min);
		Arrays.sort(array, i, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[] {5, 3, 4, 9, 7, 6};
		NextMore(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}

}
