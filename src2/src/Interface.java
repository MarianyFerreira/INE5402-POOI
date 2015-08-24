import javax.swing.JOptionPane;

public class Interface {

	public Interface() {
		super();
	}

//------- Solicita��o e Convers�o dos Valores --------------------------
	public double pegueValorRaio() {

		double raio;

		do {
			try {
				// Solicita��o do Raio
				String valorRaio = JOptionPane.showInputDialog("Forne�a o valor do Raio");
				raio = Double.parseDouble(valorRaio);
				break;

			} catch (NumberFormatException e) {
				// Tratamento da Exce��o
				JOptionPane.showMessageDialog(null,"Informe apenas n�meros (0.0)");
			}
		} while (true);

		return raio;
	}

//--------------------- Mensagem que mostra o Volume para o usu�rio ----
	public void mostreVolume(double vVolume) {
		
		/*Metodo que informa o valor calculado para o usu�rio e recebe
		 * uma variavel double como parametro que em conjunto com a
		 * classe Principal e Esfera recebe o resultado final do Volume.
		*/
		JOptionPane.showMessageDialog(null, "O Valor do Volume da Esfera �: "+ vVolume);
	}

}
