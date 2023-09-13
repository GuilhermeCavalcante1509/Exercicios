import javax.swing.JOptionPane;

public class NumerosInteiros {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeir número inteiro: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior do que o segundo.");
        } else {
            JOptionPane.showMessageDialog(null, "O segundo número é maior do que o primeiro.");
        }
    }
}
