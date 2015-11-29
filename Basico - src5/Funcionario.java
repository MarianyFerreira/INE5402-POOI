/*Exerc�cios

3.  Elabore  um  programa  que  calcula  o  sal�rio  l�quido  de  um
funcion�rio, assumindo que sobre seu sal�rio bruto incide um
desconto de 8.5% para a previd�ncia. Feito o desconto para a
previd�ncia,  sobre  o  restante  �  aplicado  um  desconto  de
26,6%, a t�tulo de imposto de renda. O programa deve mostrar o nome do
funcion�rio e os sal�rios bruto e l�quido.
 */
public class Funcionario {

	String nome;
	double salLiquido, salLiqRenda, salLiqPrev, salBruto, descPrevidencia,
			descImpRenda;

	public Funcionario() {

		nome = "Nome Funcionario";

		if (salBruto < 0.0) {
			salBruto = 0.0;
		} else
			salBruto = 0.0;

		salLiquido = 0.0;

		salLiqRenda = 0.0;
		salLiqPrev = 0.0;

		descPrevidencia = 8.5;
		descImpRenda = 26.6;

	}

	public double CalculoDesconto() {

		salLiqPrev = (salBruto * descPrevidencia) / 100;

		salLiqRenda = (salLiqPrev * descImpRenda) / 100;

		salLiquido = salBruto - salLiqRenda;

		return salLiquido;
	}

	public void getNome(String vNome) {
		nome = vNome;
	}

	public void getSalBruto(double vSalBruto) {
		salBruto = vSalBruto;
	}

}
