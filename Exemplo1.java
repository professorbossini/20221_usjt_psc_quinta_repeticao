//import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class Exemplo1{
    public static void main(String[] args) {
        int nota1, nota2;
        double media;
        int qtdeAlunos = parseInt(showInputDialog("Quantos alunos você tem, professor?"));
        int contador = 1;
        //Aluno1: 7
        //Aluno2: 10
        String resultado = "";
        while(contador <= qtdeAlunos){
            //entrada de dados
            nota1 = parseInt(showInputDialog("Digite a primeira nota"));
            nota2 = parseInt(showInputDialog("Digite a segunda nota"));
            //processamento
            media = (nota1 + nota2) / 2;
            //saída
            //showMessageDialog(null, "A média é: " + media);
            resultado = resultado + "Aluno" + contador + ": " + media + "\n";
            contador = contador + 1;
        }
        showMessageDialog(null, resultado);
    }
}