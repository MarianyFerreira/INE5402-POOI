import javax.swing.JOptionPane;

public class Exercicio2 {

	/*
	 * Fa�a um programa que leia uma s�rie de n�meros inteiros e os armazene em
	 * um array. Em seguida, o programa deve determinar se nessa s�rie de
	 * valores aparece algum valor repetido.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];

		// recebe os valores do array
		for (int i = 0; i < array.length; i++) {

			array[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o n�mero para a posi��o: [ " + (i + 1) + " ]"));

		}

		int unique = 0, repeated = 0;

		for (int i = 0; i < array.length; ++i) {
			// controle
			boolean repeats = false;

			// procura se o n�mero atual j� existe antes dele mesmo
			for (int j = 0; j < i; ++j) {
				if (array[i] == array[j]) {
					repeats = true;
					break;
				}
			}

			// se repete, aumenta contador de repeti��es, se n�o, coloca no
			// unique
			if (repeats) {
				++repeated;
			} else {
				++unique;
			}
		}

		JOptionPane.showMessageDialog(null, "H� " + unique + " valores �nicos no array.");
		JOptionPane.showMessageDialog(null, "Houve " + repeated + " repeti��es no array.");
	}

}
