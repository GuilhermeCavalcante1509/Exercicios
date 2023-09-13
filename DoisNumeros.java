import javax.swing.JOptionPane;

public class DoisNumeros {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        if (numero1 > numero2 || numero2 > numero1) {
            if (numero1 > numero2) {
                JOptionPane.showMessageDialog(null, numero1 + " é o maior.");
                return;
            }
            if (numero2 > numero1) {
                JOptionPane.showMessageDialog(null, numero2 + " é o maior.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os númeors são iguais.");
        }
    }
}        