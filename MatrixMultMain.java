package homework6;

import java.util.Arrays;

public class MatrixMultMain {
	public static void main(String args[]) throws InterruptedException {

		int[][] Matrix1 = { { 2, 2, 2 }, { 3, 3, 3 }, { 1, 1, 1 }};

		int[][] Matrix2 = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		
		System.out.println(Arrays.deepToString(MatrixMultiplication(Matrix1, Matrix2)));

	}

	static int[][] MatrixMultiplication(int[][] A, int[][] B) throws InterruptedException {
		if(A[0].length != B.length) {
			System.out.println("Matrix multiplication is not possible");
			return null;
		}
		int rowsA = A.length;
		int colsB = B[0].length;
		int[][] AB = new int[rowsA][colsB];

		int[][] invertB = new int[colsB][B.length];
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < colsB; j++) {
				invertB[i][j] = B[j][i];
			}
		}
		
		 DotProductThread[][] threads = new DotProductThread[rowsA][colsB];

	        // Launch threads
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                threads[i][j] = new DotProductThread(A[i], invertB[j]);
	                threads[i][j].start(); // use .start() to run in parallel
	            }
	        }

	        // Wait for all threads to finish
	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                threads[i][j].join();
	                AB[i][j] = threads[i][j].getDot();
	            }
	        }

		
		
		

//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				AB[i][j] = dot(A[i], invertB[j]);
//
//			}
//		}

		return AB;
	}

//	public static int dot(int[] v1, int[] v2) {
//		int dot_product = 0;
//		for (int i = 0; i < v1.length; i++) {
//			dot_product += v1[i] * v2[i];
//		}
//		return dot_product;
//	}

}
