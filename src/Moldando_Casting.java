public class Moldando_Casting{
    public static void main(String[]args) {


        /* O código abaixo compila sem problemas, uma vez que um
        double pode guardar um número com ou sem ponto flutuante.*/
        int i = 10;
        double j = i;
        System.out.println(j);


       /*Esse código não compila, double para int é incompatível.
        double l = 10;
        int m = l;
        System.out.print(j);*/


        /* Fazendo o Casting(Moldar) para corrigir */
        double b = 10;
        int m = (int) b;
        System.out.print(j);

    }
}