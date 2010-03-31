package br.unerj.poo.jogos;

public abstract class Jogo {
	protected Jogador[] jogadores;
	protected Tabuleiro tabuleiro;
	protected Dado[] dado;
	protected Jogador vez;  
	protected Jogador vencedor;
	
	public Jogo() {
		tabuleiro = new Tabuleiro();
	}
	
	public boolean jogar(int x, int y) {
		// a jogada so pode ser executada se: 
		// 1) ninguem ganhou o jogo ainda e
		// 2) se a casa onde se quer jogar estiver vazia
		
		boolean jogadaEhValida = 
			vencedor == null &&
			tabuleiro.getPeca(x, y) == null; 
		
		if (jogadaEhValida) {
			tabuleiro.setPeca(x, y, new Peca(vez));
			passaVezParaProximoJogador();  
			alguemGanhou();
		}
		
		return jogadaEhValida;
	}
	private void passaVezParaProximoJogador() {
		vez = vez == jogadores[0]? jogadores[1] : jogadores[0];
	}

	public Jogador getJogadores(int i) {
		return jogadores[i];
	}

	public Jogador getProximoJogador() {
		return vez;
	}

	public abstract boolean alguemGanhou();
	
	public Peca getPeca(int x, int y) {
		return tabuleiro.getPeca(x, y);
	}    
	
	public abstract Jogador getVencedor();
}
