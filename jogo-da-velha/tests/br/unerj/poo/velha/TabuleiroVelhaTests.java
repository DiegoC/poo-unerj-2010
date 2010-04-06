package br.unerj.poo.velha;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TabuleiroVelhaTests {
	
	TabuleiroVelha tabuleiro;                

	@Before
	public void setUp() throws Exception {
		tabuleiro = new TabuleiroVelha();
	}

	@After
	public void tearDown() throws Exception {
		tabuleiro = null;
	}                      
	
	@Test void testTabuleiroDeveSer3x3() {
		Assert.assertEquals(3, tabuleiro.getLargura());
		Assert.assertEquals(3, tabuleiro.getAltura());
	}
	                                
	@Test
	public void testTabuleiroDeveEstarVazioNoInicioDoTabuleiro() {
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
