import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      

        StringBuilder mensagem = new StringBuilder();
     
        int notaf, faltas, acima90 = 0, i = 0, acima = 0, media = 0, maior = 0, menor = 100, reprovado = 0, cond;
        
        do{
            
        notaf = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota do aluno de numero: " + i));
        faltas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de faltas do aluno de numero: " + i));
        i++;
        
        if(notaf>=90 && faltas <=20){
           acima90++;   
        }else if(notaf>=70 && notaf <90 && faltas<=20)    {
           acima++; 
        }else if(notaf<70 || faltas >=20){
          reprovado++;
        }
        
        media = notaf + media;
        
        if(maior < notaf){
        maior = notaf;    
        }
        
        if(menor > notaf ){
        menor = notaf;    
        }
                
        cond = Integer.parseInt(JOptionPane.showInputDialog("Voce quer continuar?\n 1)Sim   2)Nao"));
        }while(cond ==1);
       
       media = media/i;
       mensagem.append("Alunos com notas maiores ou igual a 90:").append(acima90).append("\nALunos reprovados: ").append(reprovado).append("\nA maior nota foi: ").append(maior).append("\nA Menor nota foi: ").append(menor).append("\nA media das notas foram: ").append(media);    
       JOptionPane.showMessageDialog(null, mensagem);
       System.exit(0);    
            
           }
           
       }
