import javax.swing.JOptionPane;

public class Aula_20_08_2024_2 {

	public static void main(String[] args) {
		//JOptionPane (entrada de dados)
		
		//String nome = JOptionPane.showInputDialog("Nome: ");
		
		//JOptionPane.showMessageDialog(null, "Mensagem: " + nome);
		
		String entrada1 = JOptionPane.showInputDialog("Entrada: ");
		String entrada2 = JOptionPane.showInputDialog("Entrada: ");
		
		int numero1 = Integer.parseInt(entrada1); //conversão de tipos (string para int)
		int numero2 = Integer.parseInt(entrada2);
		
		int sub = numero1 - numero2;
		
		JOptionPane.showMessageDialog(null, "Resultado: " + sub);
		
		
		
		
	}

}
