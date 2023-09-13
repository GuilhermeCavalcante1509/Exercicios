import javax.swing.JOptionPane;

public class ContaBancaria {
    public static void main(String[] args) {
        double saldo = 1000;
        double sacar = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor que deseja sacar: "));
        if (saldo > sacar) {
            JOptionPane.showMessageDialog(null, "Esse é o saldo restante: " + (saldo - sacar));
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o saque pois seu saldo ficaria negativo.");
        }
    }
}
