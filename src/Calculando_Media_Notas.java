//Programa Calcula média das notas
import java.util.Scanner;

public class Calculando_Media_Notas{
    public static void main(String[]args){
        double not1,not2,not3,not4;
        Scanner sNot = new Scanner(System.in);

        System.out.print("Nota1: ");
        not1 = sNot.nextDouble();

        System.out.print("Nota2: ");
        not2 = sNot.nextDouble();

        System.out.print("Nota3: ");
        not3 = sNot.nextDouble();

        System.out.print("Nota4: ");
        not4 = sNot.nextDouble();

        double soma = not1+not2+not3+not4;
        double media = soma/4;
        System.out.println("Média: "+media);

        if(media>=6) {
            System.out.println("Status: Aprovado");
        }else{
            System.out.println("Status: Reprovado");
        }

    }
}