package Matrix;

public class DivisionOfMatrixWithInputs {

	public static void main(String[] args) {


		int first[][]={{3,4,6},{2,4,3}};
		int second[][]={{3,2,3},{4,2,3}};

		int l=first.length;
		int m=first[0].length;
		System.out.println("First matrix is:" + " " );

		for(int i=0; i< l; i++){
			for (int j=0; j<m; j++){
				System.out.print(" " +first[i][j]);
			}
			System.out.println();
		}

		int n=second.length;
		int o=second[0].length;
		System.out.println("Second matrix is:"+ " ");
		for (int i=0; i< n; i++){
			for(int j=0; j<o; j++){
				System.out.print(" " + second[i][j]);
			}
			System.out.println();
		}
		System.out.println("Divide of both matrix : ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= n; j++) {
				System.out.print(" "+(first[i][j]+second[i][j]));
			}
			System.out.println("");
		}
	}
}
