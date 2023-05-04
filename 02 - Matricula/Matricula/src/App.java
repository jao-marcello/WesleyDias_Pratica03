import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder mensagem = new StringBuilder();

        int i = 0, matricula = 1 , nota1 , nota2 , nota3 , media, cond;
        String resultado = "0";

       

       while(matricula > 0){


        matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero da Matricula")); 
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 1a Nota:"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 2a Nota:"));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 3a Nota:"));

        media = (nota1 + nota2 + nota3) /3;

        if(media >= 70){
            resultado = "Aprovado";
        }else if(media >= 60 && media < 70){
            resultado = "Recuperação";
        }else if(media < 60){
            resultado = "Reprovado";
        }

        

        mensagem.append("\nAluno:" + matricula + "\nMedia de Notas: " + media + "\nSituação: " + resultado );
        JOptionPane.showMessageDialog(null, mensagem);

       }
       

        


    }
}
