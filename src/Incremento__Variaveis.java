public class Incremento__Variaveis{
    public static void main(String[]args){

        //Pós-Incremento
        //O operador ++ , quando vem após a variável, retorna o valor antigo e o incrementa
        //fazendo, no caso abaixo, i valer 6 e j valer 5.
        int i = 5;
        int j = i++;
        System.out.println("o valor de I será:"+i); // aqui I valera 6.
        System.out.println("o valor de J será:"+j); // aqui J valera 5.

        System.out.println("-----------------------");

        //Pré-Incremento
        //O operador ++ , quando vem antes da variável, retorna o valor incrementado
        //fazendo, no caso abaixo, a e b valerem 6 ambos.
        int a = 5;
        int b = ++a;
        System.out.println("o valor de A será:"+a); // aqui A valera 6.
        System.out.println("o valor de B será:"+b); // aqui B valera 6.

    }
}