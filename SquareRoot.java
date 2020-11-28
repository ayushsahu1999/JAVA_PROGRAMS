
public class SquareRoot {
	
	public static int squareRoot(int n) {
		if (n == 1)
			return 1;
		int[] arr = new int[n + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		int start = 0;
		int end = n;
		
		int number = arr[end];
		while (start < end) {
			if (start + 1 == end) {
				return arr[start];
			}
			
			int mid = (start + end) / 2;
			if (arr[mid]*arr[mid] < number) {
				start = mid;
			} else if (arr[mid]*arr[mid] > number) {
				end = mid;
			} else {
				return arr[mid];
			}
		}
		
		return arr[start];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(10));
	}

}
