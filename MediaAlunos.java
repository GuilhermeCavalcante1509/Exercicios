import javax.swing.JOptionPane;

public class MediaAlunos2 {
    public static void main(String[] args) {
        double nota = 0;
        int contadornota = 0;
        int contador8 = 0;
        int contador0 = 0;
        double media = 0;

        while (contadornota < 10) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
            media += nota;
            contadornota = contadornota + 1;
            if (nota > 8) {
                contador8 = contador8 + 1;
            }
            if (nota == 0) {
                contador0 = contador0 +1;
            }
        }
        JOptionPane.showMessageDialog(null, "Essa é a media da classe: " + media / 10);
        if (media / 10 >= 6) {
            JOptionPane.showMessageDialog(null, "Essa é a quantidade de alunos que tiveram nota maior que 8: " + contador8);
        } else {
            JOptionPane.showMessageDialog(null, "Essa é a quantidade de alunos que tiveram nota 0: " + contador0);
        }
    }
}
