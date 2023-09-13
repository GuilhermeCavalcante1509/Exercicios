import javax.swing.JOptionPane;

public class NumeroInteiroReal {
    public static void main(String[] args) {
        int numerointeiro;
        double numeroreal;

        numerointeiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Inteiro: "));
        numeroreal = Double.parseDouble(JOptionPane.showInputDialog("Digite um Número Real: "));
        if (numerointeiro < numeroreal) {
            JOptionPane.showMessageDialog(null, "O número inteiro é menor do que o número real");
        } else {
            return;
        }
    }
}
