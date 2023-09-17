//Exercício calculando fatoriais

public class Calculando_Fatorial{
    public static void main(String[]args){
        for(int i = 1; i <=10; i++){
            long fatorial = calcularFatorial(i);
            System.out.println("O Fatorial de " + i + " É: " + fatorial);
        }
    }


    //1° Criando uma função paara calcular fatorial de um número
    // A funções devem ficar fora do metodo main
    // Mas devem ficar dentro da classe
    public static long calcularFatorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            long resultado = 1;
            for(int i =2; i<=n; i++){
                resultado *= i;
            }
            return resultado;
        }
    }

}