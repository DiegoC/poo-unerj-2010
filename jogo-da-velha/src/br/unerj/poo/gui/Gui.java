package br.unerj.poo.gui;

import br.unerj.poo.jogos.*;

public abstract class Gui {
	
	private Jogo jogo;
	
    public Gui() {        
    }

	public void iniciar() {
		montaTela();
	}
     

   	public void setJogo(Jogo j) {
		jogo = j;
	}
	
	public Jogo getJogo() {
		return jogo;
	}
	
	public abstract void montaTela();
}