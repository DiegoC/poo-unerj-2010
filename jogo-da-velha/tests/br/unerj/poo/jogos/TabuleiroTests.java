package br.unerj.poo.jogos;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TabuleiroTests {
	
	Tabuleiro tabuleiro;                

	@Before
	public void setUp() throws Exception {
		tabuleiro = new Tabuleiro();
	}

	@After
	public void tearDown() throws Exception {
		tabuleiro = null;
	}            
	                                
	@Test
	public void testTabuleiroDeveEstarVazioNoInicioDotabuleiro() {
		Assert.assertNull(tabuleiro.getPeca(0, 0));
		Assert.assertNull(tabuleiro.getPeca(0, 1));
		Assert.assertNull(tabuleiro.getPeca(0, 2));
		Assert.assertNull(tabuleiro.getPeca(1, 0));
		Assert.assertNull(tabuleiro.getPeca(1, 1));
		Assert.assertNull(tabuleiro.getPeca(1, 2));
		Assert.assertNull(tabuleiro.getPeca(2, 0));
		Assert.assertNull(tabuleiro.getPeca(2, 1));
		Assert.assertNull(tabuleiro.getPeca(2, 2));
	}

}
