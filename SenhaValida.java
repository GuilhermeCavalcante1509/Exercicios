import javax.swing.JOptionPane;

public class SenhaValida {
    public static void main(String[] args) {
        int senha;
        senha = Integer.parseInt(JOptionPane.showInputDialog("Digite uma senha de 4 dígitos: "));
            if (senha >= 1000 && senha <= 9999) {
                int digitoMilhar = senha / 1000;
                int digitoCentena = (senha % 1000) / 100;
                int digitoDezena = (senha % 100) / 10;
                int digitoUnidade = senha % 10;
                if (digitoMilhar == 8 || digitoMilhar == 5) {
                    if (digitoUnidade == 5 || digitoUnidade == 1) {
                        int somaCentenaDezena = digitoCentena + digitoDezena;
                        if (digitoUnidade == 5) {
                            if (somaCentenaDezena != 3) {
                                JOptionPane.showMessageDialog(null, "Como a Unidade é 5, a dezena + centena tem q ser 3");
                                return;
                            } 
                        } else {
                            JOptionPane.showMessageDialog(null, "Senha válida");
                            return;
                        }
                        if (digitoUnidade == 1) {
                            if (somaCentenaDezena != 0) {
                                JOptionPane.showMessageDialog(null, "Como a Unidade é 1, a dezena + centena tem q ser 0");
                                return;
                            } else {
                                JOptionPane.showMessageDialog(null, "Senha válida");
                                return;
                            } 
                    }
                    JOptionPane.showMessageDialog(null, "Senha válida");
                } else {
                    JOptionPane.showMessageDialog(null, "Unidade não é 5 nem 1.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Milhar não é 8 nem 5.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha tem que ter 4 dígitos.");
        }
    }      
}