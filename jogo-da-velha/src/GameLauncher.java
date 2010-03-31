import br.unerj.poo.control.ControladorJogos;

public class GameLauncher {
	
	public static void main(String[] args) {
		ControladorJogos c = new ControladorJogos();
		c.jogar("Velha");
		c = null;
	}
	
}
