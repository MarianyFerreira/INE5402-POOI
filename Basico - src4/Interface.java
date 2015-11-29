import javax.swing.JOptionPane;

public class Interface {

	public Interface() {
		super();
	}

//------- Solicita��o e Conver��o de valores ---------------------------
	public double PegueAresta1() {								// 1.

		double aresta1 = 0.0;
		do {

			try {

				String vAresta1 = JOptionPane
						.showInputDialog("Digite o valor da Primeira Aresta");
				aresta1 = Double.parseDouble(vAresta1);
				break;

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null,
						"Informe apenas n�meros (ex: 0.0)");
			}
		} while (true);

		return aresta1;
	}
// ----------------------------------------------------------------------------------------------
	public double PegueAresta2() {								// 3.

		double aresta2 = 0.0;
		do {

			try {

				String vAresta2 = JOptionPane
						.showInputDialog("Digite o valor da Segunda Aresta");
				aresta2 = Double.parseDouble(vAresta2);
				break;

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null,
						"Informe apenas n�meros (ex: 0.0)");
			}
		} while (true);

		return aresta2;
	}
// ----------------------------------------------------------------------------------------------
	public double PegueAresta3() {								// 5.	

		double aresta3 = 0.0;
		do {

			try {

				String vAresta3 = JOptionPane
						.showInputDialog("Digite o valor da Terceira Aresta");
				aresta3 = Double.parseDouble(vAresta3);
				break;

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null,
						"Informe apenas n�meros (ex: 0.0)");
			}
		} while (true);

		return aresta3;
	}

//------- Mensagem que mostra os valores finais ao Usu�rio -------------
	public void MostreMensagem(double vAresta1, double vAresta2,
			double vAresta3, double vResultArea, double vResultVolume) {
																// 9.
				
/* Perceba que este m�todo recebe algumas variaveis como parametro que 
 * em conjunto as classes Paralelepipedo e Principal ter�o seus valores
 * devidamente 'preenchidos' ao desenrrolar do Algor�timo. A declara��o 
 * dos par�metros nesse m�todo � importante para que possamos ter a
 * Mensagem final desejada. A Ordem dos par�metros implica diretamente,
 * por isso preste muita aten��o. 
 * */

		JOptionPane.showMessageDialog(null,
				"Para o Paralelepipedo  de arestas: " + vAresta1 + " | "
						+ vAresta2 + " | " + vAresta3 + "\n A area Externa � "
						+ vResultArea + "\n O Volume �: " + vResultVolume);
	}

}
