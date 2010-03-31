package br.unerj.poo.jogos;

public class Tabuleiro {
	Casa[][] casas;
	
	public Tabuleiro() {
                // tabuleiro com 3x3 casas
		casas = new Casa[3][3];
		preencheTabuleiroComCasasVazias();
	}
	private void preencheTabuleiroComCasasVazias() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				casas[i][j] = new Casa(); 
			}
		}
	}
	public Peca getPeca(int x, int y) {
		if (casas[x][y] != null) {
			return casas[x][y].getPeca();
		} else {
			return null;
		}
	}
	public void setPeca(int x, int y, Peca peca) {
		casas[x][y].setPeca(peca);
	}

}
