package br.unerj.poo.velha;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.unerj.poo.jogos.Jogador;
import br.unerj.poo.jogos.Jogo;

public class JogoDaVelhaTests {
	
	Jogo jogo;                
	Jogador j1, j2;

	@Before
	public void setUp() throws Exception {
		jogo = new JogoDaVelha();
		j1 = jogo.getJogadores(0);
		j2 = jogo.getJogadores(1);
	}
	@After
	public void tearDown() throws Exception {
		jogo = null;
		j1 = null;
		j2 = null;
	}            

	@Test
	public void testTabuleiroDeveEstarVazioNoInicioDoJogo() {
		Assert.assertNull(jogo.getPeca(0, 0));
		Assert.assertNull(jogo.getPeca(0, 1));
		Assert.assertNull(jogo.getPeca(0, 2));
		Assert.assertNull(jogo.getPeca(1, 0));
		Assert.assertNull(jogo.getPeca(1, 1));
		Assert.assertNull(jogo.getPeca(1, 2));
		Assert.assertNull(jogo.getPeca(2, 0));
		Assert.assertNull(jogo.getPeca(2, 1));
		Assert.assertNull(jogo.getPeca(2, 2));
	}
	
	@Test
	public void testGanhaQuemAlinhar3Pecas() {
		jogo.jogar(0,0);
		Assert.assertFalse(jogo.alguemGanhou());
		
		jogo.jogar(1,0);
		Assert.assertFalse(jogo.alguemGanhou());
		
		jogo.jogar(0,1);
		Assert.assertFalse(jogo.alguemGanhou());
		
		jogo.jogar(1,1);
		Assert.assertFalse(jogo.alguemGanhou());
		
		jogo.jogar(0,2);
		Assert.assertTrue(jogo.alguemGanhou());
				
		Assert.assertEquals(j1, jogo.getVencedor());
	}

}
