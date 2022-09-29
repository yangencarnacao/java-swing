
package salariofuncionario;

import javax.swing.JOptionPane;

public class SalarioFuncionario {
    
   String nome;
   double salario;
   String mes;
    
   void dadosFuncionario(){
       
       nome = JOptionPane.showInputDialog("NOME DO FUNCIONÁRIO: ");
       salario = Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO DO FUNCIONÁRIO: "));
       mes = JOptionPane.showInputDialog("MÊS ATUAL: ");

    }
    
    void exibirDadosFuncionario(){
        
        JOptionPane.showMessageDialog(null, "O funcionário " + nome + " tem um salário de R$ " + 
                                       salario + " em  " + mes);
        
    }
    
    
}
