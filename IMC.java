import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
        double imc = (peso / ((altura * altura) ));

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso ideal.");
        }
        if (imc >= 18.5 && imc < 24.9) {
            JOptionPane.showMessageDialog(null, "Peso ideal, muito bem.");
        }
        if (imc >= 25.0 && imc < 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso, um regime leve pode ajudar.");
        }
        if (imc >= 30.0 && imc < 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade leve.");
        }
        if (imc >= 35.0 && imc < 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade moderada.");
        }
        if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "Obesidade mórbida.");
        }
    }
}
