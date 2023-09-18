//Sequência de Fibonacci

public class Fibonacci {
    public static void main(String[]args){
        int limite = 150;
        int anterior = 0;
        int atual = 1;

        System.out.println("Série de Fibonacci até passar de 100:");

        while(anterior <= limite){
            System.out.print(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

    }
}
