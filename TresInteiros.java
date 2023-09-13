import javax.swing.JOptionPane;

public class TresInteiros {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número inteiro:"));
        int soma = (numero1 + numero2 + numero3);
        int media = (numero1 + numero2 + numero3) / 3;
        int produto = (numero1 * numero2 * numero3);
        int menor = (numero1 < numero2) ? (numero1 < numero3 ? numero1 : numero3) : (numero2 < numero3 ? numero2 : numero3); 
        int maior = (numero1 > numero2) ? (numero1 > numero3 ? numero1 : numero3) : (numero2 > numero3 ? numero2 : numero3);
        JOptionPane.showMessageDialog(null, (" Essa é a soma: " + soma + "\n Essa é a média: " + media + "\n Esse é o produto: " + produto + "\n Esse é o menor número: " + menor + "\n Esse é o maior número: " + maior));
    }
}
