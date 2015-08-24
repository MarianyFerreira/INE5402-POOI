import javax.swing.JOptionPane;

public class SomaDeInteiros {

	public static void main (String [] parametros){

//--------------------- Declara��o de Variaveis --------------------
		int primValor, segValor, soma;

//--------------------- Instancia de Variaveis --------------------- 
		primValor = 0;
		segValor = 0;
		soma = 0;

//--------------------- Solicita��o e Convers�o dos Valores --------

/* 
* Para efetuar uma convers�o de modo que exce��es como receber letras
* em variaveis int; double; float n�o ocorra ultilizaremos um la�o  que 
* trata casos espec�ficos
*/

		do { // Inicio de um bloco de repeti��o

			try { // c�digo que inclui comandos que podem gerar uma situa��o de exce��o
				
				String valorA = JOptionPane.showInputDialog("Digite o valor inicial"); // Solicita��o do valor
				primValor = Integer.parseInt(valorA); // Convers�o do Valor
				
				break; // c�digo que 'para' o Try caso a exce��o n�o seja encontrada e "retorna" False para o 'while'

			} catch (NumberFormatException e) { // bloco de tratamento associado a exce��o encontrada

				JOptionPane.showMessageDialog(null, 
						"Informe apenas n�meros inteiros"); // Mensagem informando o Usu�rio sobre o Erro de Digita��o
			}
		} while (true); // Condi��o de repeti��o que finaliza o la�o 'do' caso o while receba um valor falso "fornecido" pelo Try Catch


		do {
			try {
				String valorB = JOptionPane.showInputDialog("Digite o valor a ser Somado");
				segValor = Integer.parseInt(valorB);
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe apenas n�meros inteiros");
			}
			
		} while (true);

//--------------------- Calculo ------------------------------------
		soma = primValor + segValor;

//--------------------- Resultado ----------------------------------
		JOptionPane.showMessageDialog(null, "A soma entre os valores" + primValor + " e " + segValor + " � " + soma);
	}


}
