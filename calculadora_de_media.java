
import java.util.Scanner; //BIBLIOTECA

public class calculadora_de_media{
    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in); //INPUT DA BIBLIOTECA

        //variaveis
        double nota1, nota2, nota3;
        double m = 59.9;

        //entrada
        System.out.print("Digite sua nota...:");
        nota1 = input .nextDouble();

        System.out.print("Digite sua nota Multidisciplinar...:");
        nota2 = input .nextDouble();

        System.out.print("Digite sua nota Moodle...:");
        nota3 = input .nextDouble();

        //processamento
        if (((nota1 + nota2 + nota3) / 3) > m) System.out.print("Parabéns!! Você foi aprovado.");
        else System.out.print("Você foi reprovado, mais sorte da próxima!");

        input.close();
    }
}
    


     
    


    