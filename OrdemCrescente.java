import javax.swing.JOptionPane;

public class OrdemCrescente {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

        if ((numero1 == numero2) || (numero1 == numero3) || (numero2 == numero3)) {
            JOptionPane.showMessageDialog(null, "Os números não podem ser iguais.");
        } else {
            int maior = Math.max(Math.max(numero1, numero2), numero3);
            int menor = Math.min(Math.min(numero1, numero2), numero3);
            int meio = 0;

            if(((maior == numero1) && (menor == numero2)) || ((menor == numero1) && (maior == numero2))) {
                meio = numero3;
            } else if (((maior == numero1) && (menor == numero3)) || ((menor == numero1) && (maior == numero3))) {
                meio = numero2;
            } else {
                meio = numero1;
            }
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + menor + " " + meio + " " + maior);
        }
    }
}
