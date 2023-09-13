import javax.swing.JOptionPane;

public class Cardapio {
    public static void main(String[] args) {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha das seguintes opções: \n1 - Misto quente R$5,50 \n2 - Salada Chinesa R$10,20 \n3 - Suco de Laranja R$4,00 \n4 - Suco de Manga R$3,50."));
    
        switch (escolha) {
            case 1: {
                JOptionPane.showMessageDialog(null, "Bom apetite, vai lhe custar: R$ 5,50");
                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, "Bom apetite, vai lhe custar: R$ 10,20");
                break;
            }
            case 3: {
                JOptionPane.showMessageDialog(null, "Tenha um excelente drink, vai lhe custar: R$ 4,00");
                break;
            }
            case 4: {
                JOptionPane.showMessageDialog(null, "Tenha um excelente drink, vai lhe custar: R$ 3,50");
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Erro");
                break;
            }
        }
    }
}
