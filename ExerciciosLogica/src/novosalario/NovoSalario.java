package novosalario;

import javax.swing.JOptionPane;

/**
 *
 * @author yang
 */
public class NovoSalario {
    
    double salario, novoSalario;
    
    void entradaSalario(){
        salario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O SALÁRIO: "));
        novoSalario = ( salario * 1.5);
                
    }
    
    void saidaSalario(){
        JOptionPane.showMessageDialog(null, "NOVO SALÁRIO: " + novoSalario);
    }
    
}
