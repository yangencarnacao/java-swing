
package exercícioaluno;

import javax.swing.JOptionPane;

public class Aluno {
    
    String nome;
    String cpf;
    String endereco;
    String telefoneContato;
    
    void inserirDadosPessoais(){
        
        nome = JOptionPane.showInputDialog("DIGITE O NOME DO ALUNO: ");        
        cpf = JOptionPane.showInputDialog("DIGITE CPF DO ALUNO: ");
        endereco = JOptionPane.showInputDialog("DIGITE O ENDEREÇO DO ALUNO: ");        
        telefoneContato = JOptionPane.showInputDialog("DIGITE O TELEFONE DE CONTATO DO ALUNO: ");
        
    }

    void exibirDadosPessoais(){
        JOptionPane.showMessageDialog(null, "DADOS PESSOAIS DO ALUNO\n" +
                                            "-------------------------" + 
                                            "NOME       " + nome + "\n" +                                             "NOME       " + nome + "\n" +
                                            "CPF       " + cpf + "\n" +
                                            "ENDEREÇO       " + endereco + "\n" +
                                            "TELEFONE DE CONTATO       " + telefoneContato + "\n" +
                                            "-------------------------" );
        
        
    }
            
    
}
