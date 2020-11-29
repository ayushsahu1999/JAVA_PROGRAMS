
public class Perfect {
	
	public static void perfect(int num) {
		int i = 1, sum = 0;
		while (i <= num / 2) {
			if (num % i == 0) {
				sum += i;
			}
			i++;
		}
		
		if (sum == num) {
			System.out.println("Perfect");
		} else {
			System.out.println("Not Perfect");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perfect(33550336);
	}

}
