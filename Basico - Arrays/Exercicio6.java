import javax.swing.JOptionPane;

public class Exercicio6 {
	/*
	 * 
	 * Fa�a um programa que leia um array X[0..19] e, ap�s, troque a posi��o do
	 * 1� elemento pela posi��o do 20� elemento, o 2� com o 19� e assim por
	 * diante. Ao final, imprima X.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = new String[20];
		String posicaoMenor = "", posicaoMaior = "", arrayValores = "";

		for (int i = 0; i < array.length; i++) {

			array[i] = JOptionPane.showInputDialog("Informe o valor para [ " + (i) + " ]");

		}

		for (int i = 0; i < (array.length / 2); i++) {

			posicaoMenor = array[i];
			posicaoMaior = array[(array.length - (i + 1))];

				array[i] = posicaoMaior;
				array[(array.length - (i + 1))] = posicaoMenor;

		}

		for (int i = 0; i < array.length; i++) {

			arrayValores += "Posi��o: " + i + "   Valor: " + array[i] + "\n";

		}

		JOptionPane.showMessageDialog(null, arrayValores);
	}
}
