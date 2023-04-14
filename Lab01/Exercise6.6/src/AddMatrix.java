public class AddMatrix {
	public static void main(String[] args) {
		int[][] matrix1 = {{1,2,3},{4,5,6}};
		int[][] matrix2 = {{3,4,5},{4,5,6}};
		
		int[][] matrix3 = new int[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		for (int k = 0; k < matrix3.length; k++) {
			for (int h = 0; h < matrix3[0].length; h++) {
				System.out.print(matrix3[k][h] + " ");
			}
			System.out.println();
		}
	}
}
