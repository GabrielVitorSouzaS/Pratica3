/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica3atividade2;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica3Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
        
        int media, n1, n2, n3, i=0, matricula;
        
    do{
 i++;
 matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira a matricula do aluno de numero: " + i));       
 
 if(matricula>=0){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota  1 do aluno de numero: " + i));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota 2 do aluno de numero: " + i));        
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota 3 do aluno de numero: " + i));            
       media = (n1+n2+n3)/3;     

       if(media >= 70){
       mensagem.append("APROVADO");   
       JOptionPane.showMessageDialog(null,mensagem);
       }else if(media>=60 &&media <70){
       mensagem.append("ESTA EM RECUPERAÇAO");   
       JOptionPane.showMessageDialog(null,mensagem);       
       }else if(media<60){
       mensagem.append("REPROVADO");   
       JOptionPane.showMessageDialog(null,mensagem);  
       }
}    
 
 
 
    }while(matricula>=0);    
    System.exit(0);
    }
    
}
