import java.util.Scanner;

public class Despesas_Trimestres{
    public static void main (String[]args){
        double j, f, m;
        String mensg = "Gasto Mensal ";
        Scanner scaT = new Scanner(System.in);

        System.out.print(mensg+"De Janeiro: " );
        j = scaT.nextDouble();

        System.out.print(mensg+"De Fevereiro: " );
        f = scaT.nextDouble();

        System.out.print(mensg+"De Março: " );
        m = scaT.nextDouble();

        double soma = j+f+m;
        double mediaMensal = soma/3;

        System.out.println("Gasto Trimensal: "+soma);
        System.out.print("Gasto Médio Mensal: "+mediaMensal);
    }
}