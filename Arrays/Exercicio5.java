import javax.swing.JOptionPane;

public class Exercicio5 {
/*

Escreva um programa que leia um arranjo X de N
elementos e um valor qualquer K. Ap�s, determine e
imprima o array resultante da multiplica��o de K por X.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] array = new double[5];

		int k = 0;
		String arrayValores = " ";

		for (int i = 0; i < array.length; i++) {

			array[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para [ " + (i) + " ]"));

		}
		
		k = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da Multiplica��o"));
		
		for (int i = 0; i < array.length; i++) {

			array[i] = array[i] * k;
			arrayValores += "Posi��o: " + i + "   Valor: " + array[i] + "\n";
		}


		JOptionPane.showMessageDialog(null, arrayValores);
		
	}

}
