package mensagem;

import javax.swing.JOptionPane;

public class MensagemSaudacao {
    
    String nome;

	void nomeMensagem(){

	 nome = JOptionPane.showInputDialog("DIGITE SEU NOME: ");


}
     void exibirMensagemSaudacao(){
        JOptionPane.showMessageDialog(null, "Olá, " + nome + " Prazer te conhecer!");
    
    }
     
}