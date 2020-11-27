
public class MatrixRotation {
	
	public static void rotation(int[][] matrix) {
		int N = matrix[0].length;
		for (int x = 0; x < N / 2; x++) {
			for (int y = x; y < N-1-x; y++) {
				int temp = matrix[N-1-y][x];
				matrix[N-1-y][x] = matrix[N-1-x][N-1-y];
				matrix[N-1-x][N-1-y] = matrix[y][N-1-x];
				matrix[y][N-1-x] = matrix[x][y];
				matrix[x][y] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 12, 13}, {14, 15, 16, 17}};
		rotation(matrix);
		
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
