
public class Frequency {
	
	public static void frequency(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			array[i]--;
		}
		
		for (int i = 0; i < n; i++) {
			array[array[i] % n] = n + array[array[i] % n];
		}
		
		for (int i = 0; i < n; i ++) {
			System.out.println((i + 1) + " " + (array[i] / n));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[] {6, 4, 4, 6, 1, 2, 3};
		frequency(array);
	}

}
