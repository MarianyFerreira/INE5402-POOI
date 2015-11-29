import javax.swing.JOptionPane;

public class Interface {

	public Interface() {
		super();
	}

	public String PegueNome() {

		String nome = JOptionPane
				.showInputDialog("Informe o nome do Funcion�rio");
		return nome;
	}

	public double PegueSalarioBruto() {

		double salBruto = 0.0;

		do {
			try {
				String vSalBruto = JOptionPane
						.showInputDialog("Informe o Sal�rio Bruto do Funcion�rio");
				salBruto = Double.parseDouble(vSalBruto);
				break;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Informe apenas n�meros (0.0)");
			}
		} while (true);

		return salBruto;
	}

	public void MostreMensagem(String vNome, double vSalBruto,
			double vSalLiquido) {

		JOptionPane.showMessageDialog(null, "O Funcin�rio" + vNome
				+ " possui: \n" + "Sal�rio Bruto: " + vSalBruto
				+ "\n Sal�rio Liquido: " + vSalLiquido);
	}

}
