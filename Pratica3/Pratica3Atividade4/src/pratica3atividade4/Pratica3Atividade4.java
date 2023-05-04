/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica3atividade4;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica3Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            StringBuilder mensagem = new StringBuilder();
            
            int salario, somsalario=0, filhos, somfilhos=0, i=0;
            
           do{
           
            
            salario = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu salario"));
            
            if(salario>=0){
            filhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos voce tem"));    
            somsalario = salario + somsalario;   
            somfilhos = filhos + somfilhos;
            i++;
            }
            
           }while(salario>=0); 
    
    somfilhos = somfilhos /i;
    somsalario = somsalario /i;
    
    mensagem.append("A media dos salario e: ").append(somsalario).append("\nA media de numeros de casas por familia e: ").append(somfilhos);
    JOptionPane.showMessageDialog(null,mensagem)
            ;
    System.exit(0);
    
    }
    
}
