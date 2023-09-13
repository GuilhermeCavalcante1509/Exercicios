import javax.swing.JOptionPane;

public class PecadeRoupa {
    public static void main(String[] args) {
        double valordapeca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça: "));
        int tipodecompra = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para compra à vista, 1 para compra parcelada e 2 para crediário."));
        double desconto;
        int numeroparcelas;
        double juros;

        switch (tipodecompra) {
            case 0: {
                desconto = (valordapeca * 10) / 100;
                JOptionPane.showMessageDialog(null, "Esse é o valor da peça com 10% de desconto: " + (valordapeca - desconto));
                break;
            }
            case 1: {
                numeroparcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas parcelas deseja: "));
                JOptionPane.showMessageDialog(null, "Esse é o valor das parcelas a serem pagas: " + (valordapeca / numeroparcelas));
                break;
            }
            case 2: {
                juros = (valordapeca * 10) / 100;
                JOptionPane.showMessageDialog(null, "Esse é o valor da peça com juros: " + (valordapeca + juros));
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Opção Inváldia");
            }
        }
    }
}
