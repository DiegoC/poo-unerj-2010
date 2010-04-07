package br.unerj.poo.jogos;

public abstract class Tabuleiro {
	Casa[][] casas;
	
	public Tabuleiro() {
		criaTabuleiroComDimensaoApropriada();
    	inicializaTabuleiro();
	}                       
	
	public abstract int getLargura();
	public abstract int getAltura();
	         
	protected void criaTabuleiroComDimensaoApropriada() {
		casas = new Casa[getLargura()][getAltura()];
	}
	
	protected void inicializaTabuleiro() {
		for (int i = 0; i < getLargura(); i++) {
			for (int j = 0; j < getAltura(); j++) {
				casas[i][j] = new Casa(); 
			}
		}
	}              
	 
	public Peca getPeca(int x, int y) {
		assert x < getLargura();
		assert y < getAltura();
		if (casas[x][y] != null) {
			return casas[x][y].getPeca();
		} else {
			return null;
		}
	} 
	
	public void setPeca(int x, int y, Peca peca) {
		assert x < getLargura();
		assert y < getAltura();
		casas[x][y].setPeca(peca);
	}

}
