package br.unerj.poo.velha;

import br.unerj.poo.jogos.*;

public  class JogoDaVelha extends Jogo {

    public JogoDaVelha() {
		super();
		jogadores = new Jogador[2];
		jogadores[0] = new Jogador("O");
		jogadores[1] = new Jogador("X");   
		vez = jogadores[0];     
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
	 
	public Jogador getVencedor() {
		if (vencedor == null) {
			vencedor = 
				fechouLinha(0)? getPeca(0,0).getJogador() :
				fechouLinha(1)? getPeca(1,0).getJogador() :
				fechouLinha(2)? getPeca(2,0).getJogador() :
				fechouColuna(0)? getPeca(0,0).getJogador() :
				fechouColuna(1)? getPeca(0,1).getJogador() :
				fechouColuna(2)? getPeca(0,2).getJogador() :
				fechouDiagonalPrincipal()? getPeca(0,0).getJogador() :
				fechouDiagonalSecundaria()? getPeca(2,0).getJogador() : null;
		}
		return vencedor;		
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

	@Override
	protected Tabuleiro novoTabuleiroParaEsteJogo() {
		return new TabuleiroVelha();
	} 
	
}
