/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícioaluno;

/**
 *
 * @author yang
 */
public class InstanciaAlunoTurma {
    
    public static void main (String args[]){
        
        Aluno AL = new Aluno();
        Turma TM = new Turma();
        
        AL.inserirDadosPessoais();
        
        TM.nome = AL.nome;
        TM.alocarAlunoemTurma();
        
        TM.exibirMatricula();
    }
    
}
