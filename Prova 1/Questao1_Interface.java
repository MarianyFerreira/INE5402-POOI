import javax.swing.JOptionPane;

public class Questao1_Interface {

	public Questao1_Interface() {
		super();
	}

	// METODO QUE RECEBE UM DOUBLE GEN�RICO

	public double pegueDouble(String m) {

		return Double.parseDouble(JOptionPane.showInputDialog(m));
	}

	// METODO QUE MOSTRA UMA MENSAGEM GENERICA

	public void mostraMensagem(String m) {

		JOptionPane.showMessageDialog(null, m);
	}

}
