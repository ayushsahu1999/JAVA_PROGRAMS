
public class Celebrity {
	
	public static int checkCelebrity(int[][] array) {
		int x = 0, y = array[0].length - 1;
		
		while (x < y) {
			if (array[x][y] == 1)
				x++;
			else
				y--;
		}
		
		for (int i = 0; i < array.length; i++) {
			if (i != y) {
				if (array[i][y] == 0)
					return -1;
			}
		}
		
		for (int i = 0; i < array[x].length; i++) {
			if (array[x][i] == 1)
				return -1;
		}
		
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[][] {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}};
		int b = checkCelebrity(array);
		
		if (b < 0)
			System.out.println("No celebrity was present");
		else
			System.out.println(b);

	}

}
