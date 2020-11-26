
public class SpiralMatrix {
	
	public static void spiral(int[][] matrix, int k, int m, int n, int p) {
		
		if (k > m && n > p)
			return;
		
		if (k < 0 || m < 0 || n < 0 || p < 0) {
			return;
		}
		
		int i, j;
		i = n;
		for (j = k; j < m; j++) {
			System.out.print(matrix[i][j] + " ");
		}
		j = m;
		for (i = n; i < p; i++) {
			System.out.print(matrix[i][j] + " ");
		}
		i = p;
		for (j = m; j > k; j--) {
			System.out.print(matrix[i][j] + " ");
		}
		j = k;
		for (i = p; i > n; i--) {
			System.out.print(matrix[i][j] + " ");
		}
		spiral(matrix, k+1, m-1, n+1, p-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int m = matrix.length;
		int p = matrix[0].length;
		spiral(matrix, 0, m-1, 0, p-1);
	}

}
