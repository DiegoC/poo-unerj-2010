package br.unerj.poo.jogos;

public class Jogo {
	private Jogador[] jogadores;
	private Tabuleiro tabuleiro;
	private Dado[] dado;
	private Jogador vez;
	
	public Jogo() {
		tabuleiro = new Tabuleiro();
		jogadores = new Jogador[2];
		jogadores[0] = new Jogador("O");
		jogadores[1] = new Jogador("X");
		
		vez = jogadores[0];
	}
	
	public boolean jogar(int x, int y) {
		// a jogada so pode ser executada se a casa estiver 
		// vazia
		
		boolean jogadaEhValida = 
			tabuleiro.getPeca(x, y) == null; 
		
		if (jogadaEhValida) {
			tabuleiro.setPeca(x, y, new Peca(vez));
			passaVezParaProximoJogador();  // <-------
		}
		
		return jogadaEhValida;
	}
    // |
	// V
	private void passaVezParaProximoJogador() {
		vez = vez == jogadores[0]? jogadores[1] : jogadores[0];
	}

	public Jogador getJogadores(int i) {
		return jogadores[i];
	}

	public Jogador getProximoJogador() {
		return vez;
	}

	public boolean alguemGanhou() {
		return 
			fechouLinha(0) || 
			fechouLinha(1) || 
			fechouLinha(2) ||
			fechouColuna(0) || 
			fechouColuna(1) ||
			fechouColuna(2) ||
			fechouDiagonalPrincipal() ||
			fechouDiagonalSecundaria();
	}
	
	private boolean fechouLinha(int i) {
		boolean fechou = 
			tabuleiro.getPeca(i, 0) != null &&
			tabuleiro.getPeca(i, 0).equals(tabuleiro.getPeca(i, 1)) &&
			tabuleiro.getPeca(i, 0).equals(tabuleiro.getPeca(i, 2));
		return fechou;
	}

	private boolean fechouColuna(int i) {
		boolean fechou = 
			tabuleiro.getPeca(0, i) != null &&
			tabuleiro.getPeca(0, i).equals(tabuleiro.getPeca(1, i)) &&
			tabuleiro.getPeca(0, i).equals(tabuleiro.getPeca(2, i));
		return fechou;
	}

	private boolean fechouDiagonalPrincipal() {
		boolean fechou = 
			tabuleiro.getPeca(0, 0) != null &&
			tabuleiro.getPeca(0, 0) == tabuleiro.getPeca(1, 1) &&
			tabuleiro.getPeca(0, 0) == tabuleiro.getPeca(2, 2);
		return fechou;
	}

	private boolean fechouDiagonalSecundaria() {
		boolean fechou = 
			tabuleiro.getPeca(2, 0) != null  &&
			tabuleiro.getPeca(2, 0) == tabuleiro.getPeca(1, 1) &&
			tabuleiro.getPeca(2, 0) == tabuleiro.getPeca(0, 2);
		return fechou;
	}
}
