import java.util.Arrays;

public class Platform {
	
	public static int platforms(int[] arrival, int[] departure) {
		Arrays.sort(departure);
		int i = 0, j = 0, platform_number = 0, max_platforms = 0;
		int n = arrival.length;
		while (i < n && j < n) {
			if (arrival[i] < departure[j]) {
				i++;
				platform_number++;
				if (max_platforms < platform_number)
					max_platforms = platform_number;
				
			}
			else {
				j++;
				platform_number--;
			}
		}
		return max_platforms;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrival[] = new int[] {100, 140, 150, 200, 215, 400};
		int departure[] = new int[] {110, 300, 220, 230, 315, 600};
		
		int number_of_platforms = platforms(arrival, departure);
		System.out.println(number_of_platforms);
	}

}
