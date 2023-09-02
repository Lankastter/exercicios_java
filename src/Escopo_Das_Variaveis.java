/*
// O escopo da variável é o nome dado ao trecho de código
// em que aquela variável existe e o lugar onde é possível acessá-la.

public class Escopo_Das_Variaveis{
    public static void main(String[]args) {


        // aqui, a variável i não existe.
        int i = 5;
        // a partir daqui, ela existe.


        // aqui, a variável i não existe.
        int i = 5;
        // a partir daqui, ela existe.
        while (condicao) {
            // o i ainda vale aqui.
            int j = 7;
            // o j passa a existir.
        }
        // aqui, o j não existe mais, porém o i continua dentro do escopo.


        //O mesmo vale para um if:
        if (algumBooleano) {
            int i = 5;
        } else {
            int i = 10;
        }
        System.out.println(i); // cuidado!
        //Aqui a variável i não existe fora do if e do else !


        // A forma correta de acessar o i depois do if:
        int i;
        if (algumBooleano) {
            i = 5;
        } else {
            i = 10;
        }
        System.out.println(i);


        //Uma situação parecida pode ocorrer com o for :
        for (int i = 0; i < 10; i++) {
            System.out.println("olá!");
        }
        System.out.println(i); // cuidado!
        //Aqui a variável i não existe fora do for!


        // A forma correta de acessar o i depois do loop:
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("olá!");
        }
        System.out.println(i);

    }
}
 */