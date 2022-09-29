/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícioaluno;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author yang
 */
public class Turma {
    
    String nomeTurma, nome;
    int codigoTurma;
    String turno;
    String sala;
    int numeroMatricula;
    Random RD = new Random();
    
    void alocarAlunoemTurma(){
        
        nomeTurma = JOptionPane.showInputDialog("DIGITE O NOME DA TURMA: ");
        turno = JOptionPane.showInputDialog("DIGITE O TURNO DA TURMA: ");
        sala = JOptionPane.showInputDialog("DIGITE A SALA DA TURMA: ");
        numeroMatricula = RD.nextInt(555);
        codigoTurma = RD.nextInt(555);
        
        JOptionPane.showMessageDialog(null, "MATRÍCULA GERADA COM SUCESSO");
                
    }
    
   void exibirMatricula(){
        JOptionPane.showMessageDialog(null, "DADOS DE MATRÍCULA DO ALUNO\n" +
                                            "-------------------------" + 
                                            "NOME DO ALUNO       " + nome + "\n" +       
                                            "-------------------------" + 
                                            "MATRÍCULA DO ALUNO       " + numeroMatricula + "\n" +
                                            "TURMA       " + codigoTurma + "\n" +
                                            "TURMA       " + nomeTurma + "\n" +
                                            "TURNO       " + turno + "\n" +
                                            "SALA       " + sala + "\n" +
                                            "-------------------------" );
        
        
    } 
    
    
}
