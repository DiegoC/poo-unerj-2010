package br.unerj.poo.control;   

import br.unerj.poo.gui.*;
import br.unerj.poo.jogos.*;

public class ControladorJogos {
	
	public ControladorJogos() {
		
	}   
	
	public void jogar(String nome) {
		if ("velha".equals(nome)) {
			Gui gui = new br.unerj.poo.gui.JogoDaVelha();
			Jogo jogo = new br.unerj.poo.velha.JogoDaVelha();
			gui.setJogo(jogo);
			gui.iniciar();			
		}
	}
}
