public class Comando_Do_While{
    public static void main(String[]args) {

        //A principal diferença entre 'do...while' e 'while' é que
        // o 'do...while' garante que o bloco de código seja executado
        // pelo menos uma vez, mesmo que a condição seja falsa desde o início.

        int i = 0;

        do{
            System.out.println("i: "+i);
            i++;
        } while(i==2);

    }
}