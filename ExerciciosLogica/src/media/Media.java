
package media;

import javax.swing.JOptionPane;

public class Media {
    
 double n1, n2, media;
    
   void valoresMedia(){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A PRIMEIRA NOTA: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A SEGUNDA NOTA: "));
        media = (n1 + n2)/2;
        
    }
   
   void resultadoMedia(){
       JOptionPane.showMessageDialog(null, "A MÉDIA ENTRE " + n1 + " e " + n2 + " é igual a " + media + ".");
   }
        
    
}