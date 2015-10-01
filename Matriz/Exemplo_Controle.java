import javax.swing.JOptionPane;
/*Implemente um programa que:
� O usu�rio informa a ordem da matriz;
� O usu�rio informa os elementos da matriz;
� A   l�gica   da   aplica��o   calcula   a   soma   da
segunda linha da matriz;
� A l�gica da aplica��o calcula a soma de todos
os elementos da matriz.
� A  aplica��o  deve  ser  implementada  seguindo
uma arquitetura em tr�s camadas.*/

public class Exemplo_Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exemplo_Interface Interface = new Exemplo_Interface();
		int ordem = Interface.getInteger("Informe a Ordem da Matriz");

		Exemplo_Matriz Matriz = new Exemplo_Matriz(ordem);
		
		int [][] mat = Matriz.getMatriz();
		int somaElementos = 0;
		
		for (int linha = 0; linha < mat[0].length; linha++){
			
			for (int coluna = 0; coluna < mat.length; coluna++){
				
				mat[linha][coluna] = Interface.getInteger("Informe o valor a ser armazenado (Linha: [ " + (linha +1) + " ] " + " Coluna: [ " + (coluna +1) + " ])");
				
				somaElementos += mat [linha][coluna];
			}
			
		}
		
		int linhaSoma = Integer.parseInt(JOptionPane.showInputDialog("Informe a linha a ser somada"));
		
		JOptionPane.showMessageDialog(null,"A soma da Matriz em geral �: " + somaElementos + "\n" +
										   " A soma da Segunda linha da Matriz �: " + Matriz.somalinha(linhaSoma));
		
		
		
	}

}