/*  Em Java, quando você tenta dividir um número inteiro por 0 ou 0.0,
    ocorre uma exceção do tipo 'ArithmeticException'. Isso é conhecido
    como "divisão por zero" e não é permitido em operações com
    números inteiros, pois não há um valor numérico definido para o
    resultado dessa operação.


public class Dividindo_Int_Por_Zero {
    public static void main(String[] args) {

        int resultado = 10 / 0;    // Isso lançará uma exceção ArithmeticException
        int resultado2 = 10 / 0.0; // Isso também lançará uma exceção ArithmeticException

    }
}

   Independentemente do tipo do denominador (inteiro ou ponto flutuante),
   tentar dividir um número inteiro por zero resultará em uma exceção
   de divisão por zero em Java. É importante tratar essas exceções
   adequadamente em seu código para evitar falhas inesperadas e lidar
   com situações de divisão por zero de maneira apropriada.
 */