import javax.swing.JOptionPane;

public class NumerosReaisIguais {
    public static void main(String[] args) {
        double numeroreal1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número real: "));
        double numeroreal2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número real: "));
        
        if (numeroreal1 == numeroreal2) {
            JOptionPane.showMessageDialog(null, "Os números reais são iguais.");
        } else {
            return;
        }
    }
}
