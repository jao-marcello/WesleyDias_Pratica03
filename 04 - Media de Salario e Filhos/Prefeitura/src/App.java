import javax.swing.JOptionPane;
public class App {

    public static void main(String[] args) {
            StringBuilder mensagem = new StringBuilder();
            
            int salario, somsalario=0, filhos, somfilhos=0, i=0;
            
           do{
            salario = Integer.parseInt(JOptionPane.showInputDialog("Informe seu salario: "));

            if(salario>=0){
            filhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos você tem?"));    
            somsalario = salario + somsalario;   
            somfilhos = filhos + somfilhos;
            i++;
            }
            
           }while(salario>=0); 
    
    somfilhos = somfilhos /i;
    somsalario = somsalario /i;
    
    mensagem.append("A media salarial da população é: ").append(somsalario).append("\nÁ media de filhos por familia é: ").append(somfilhos);
    JOptionPane.showMessageDialog(null,mensagem)
            ;
    System.exit(0);
    
    }

}