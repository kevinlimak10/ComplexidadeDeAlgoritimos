package Trabalho;

public class Algoritmos {

	public static void main(String[] args) {
		long tempoInicial = System.nanoTime();
		int[][] bloco = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		boolean simNao = verificaSudoku(bloco);
		if(simNao) System.out.println("Passou");
		else System.out.println("reprovou");
		long tempo = System.nanoTime() - tempoInicial;
		System.out.println("tempo: " + tempo);
	}

	// Function to find n'th Bell Number

	static boolean verificaSudoku(int[][] tabuleiro) {
		// verifica os 9 blocos
		int numeroFaltando[] = new int[9];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int count = 0; count < 9; count++) {
					if (tabuleiro[i][j] == numeroFaltando[count]) {
						return false;
					}
					 numeroFaltando[count] =tabuleiro[i][j];
				}
			}
		}
		return true;
	}

}
