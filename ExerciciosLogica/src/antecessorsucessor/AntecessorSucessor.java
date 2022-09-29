package antecessorsucessor;

import javax.swing.JOptionPane;


public class AntecessorSucessor {
    
    int numero;
    int antecessor;
    int sucesssor;
    
    void entradaNumeros(){
        numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NÚMERO: "));
        antecessor = (numero-1);
        sucesssor = (numero + 1);    
      
    
}
    
    void saidaNumeros(){
        JOptionPane.showMessageDialog(null, " O antecessor de " + numero + " é " +
                antecessor + "." + " O sucessor de " + numero + " é " + sucesssor);
    }
}