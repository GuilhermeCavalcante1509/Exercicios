import javax.swing.JOptionPane;

public class Salario {
    public static void main(String[] args) {
        double valorhora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor/hora: "));
        int horastrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite o tanto de horas trabalhadas: "));
        double imposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do imposto: "));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão: "));
        double salariobruto = valorhora * horastrabalhadas;

        JOptionPane.showMessageDialog(null, "Esse é o seu sálario bruto: " + salariobruto);
        if(horastrabalhadas >= 120) {
            JOptionPane.showMessageDialog(null, "Esse é o seu sálario líquido: " + (salariobruto - imposto + comissao));
        } else {
            JOptionPane.showMessageDialog(null, "Esse é o seu sálario líquido: " + (salariobruto - imposto));
        }
    }
}
