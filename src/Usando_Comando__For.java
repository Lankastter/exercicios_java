/*
        --> A ideia é a mesma do while : fazer um trecho de código ser repetido,
            enquanto uma condição continuar verdadeira.

        -->Mas, além disso, o for isola também um espaço para inicialização de variáveis
           e o modificador dessas variáveis.

        -->Isso faz com que as variáveis relacionadas ao loop fiquem mais legíveis:

                    for (inicializacao; condicao; incremento) {
                         codigo;
                    }
*/

public class Usando_Comando__For {
    public static void main(String[]args){

        for(int i=0; i<10; i=i+1){
            System.out.println(i);
        }

        //Mesmo exemplo usando o While
        int i = 0;
        while(i<10){
            System.out.print(i);
            i = i + 1;
        }
    }
}

