
package somadoisvalores;

import javax.swing.JOptionPane;

public class SomaDoisValores {
    
    double n1, n2, soma;
    
   void valoresSoma(){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UM VALOR: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE OUTRO VALOR: "));
        soma = n1 + n2;
        
    }
   
   void resultadoSoma(){
       JOptionPane.showMessageDialog(null, "A SOMA ENTRE " + n1 + " e " + n2 + " é igual a " + soma + ".");
   }
        
    
}
