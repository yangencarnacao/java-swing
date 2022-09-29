package mensagem;

import javax.swing.JOptionPane;

/**
 *
 * @author yang
 */
public class MensagemSaudacao {
    
    String nome;

	void mensagemSaudacao(){

	 nome = JOptionPane.showInputDialog("DIGITE SEU NOME: ");


}
     void exibirSaudacao(){
        JOptionPane.showMessageDialog(null, "Olá, " + nome + " Prazer te conhecer!");
    
    }
     
}