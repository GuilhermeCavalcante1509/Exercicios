import javax.swing.JOptionPane;

public class Carga {
    public static void main(String[] args) {
        int codigoestado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 5: "));
        double valorcarga = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor inicial da carga:"));
        double desconto;

        if(codigoestado == 2 || codigoestado == 5) {
            desconto = (valorcarga * 12) / 100;
            JOptionPane.showMessageDialog(null, "Esse é o valor final da carga: " + (valorcarga - desconto));
        }
        if(codigoestado == 1 || codigoestado == 3 || codigoestado == 4) {
            desconto = (valorcarga * 15) / 100;
            JOptionPane.showMessageDialog(null, "Esse é o valor final da carga: " + (valorcarga - desconto));
        }
    }
}
