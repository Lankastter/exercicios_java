//Um bloco também pode ser declarado dentro de outro.

public class Bloco_Dentro_Do_Bloco {
    public static void main(String[]args){

        //Aqui temos um 'for' dentro do bloco 'while'
       int i = 0;
        while(i<=2){
            for(int j = 0; j<2; j++){
                System.out.println("i: " +i);
                System.out.println("j: " +j);
            }
            i++;
        }

        System.out.println("----------------------------");

        //Aqui temos um 'for' e 'if' dentro de um bloco 'for'
        for (int a = 0; a <= 2; a++) {
            for (int b = 0; b < 2; b++) {
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                if (a == 1 && b == 1) {
                    System.out.println("A é igual a 1 e B é igual a 1");
                }
            }
        }



    }
}
