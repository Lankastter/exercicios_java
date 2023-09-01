public class Controlando_Loop{
    public static void main(String[]args){


        //Comando Break
        //A declaração break é usada para sair imediatamente de um loop,
        //independentemente das condições restantes.
        // Aqui está um exemplo:

        for(int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Encontrou o número 5!");
                break;//Sai do loop quando i é igual a 5
            }
            System.out.println("i = " + i);
        }



        //Comando Continue
        //A declaração continue é usada para pular a iteração atual
        // e continuar com a próxima iteração do loop.
        // Aqui está um exemplo:

        for(int j=1; j<=5; j++){
            if(j==3){
                System.out.println("j é igual a 3!");
                continue; // Pula a iteração quando j é igual a 3
            }
            System.out.println("j = " + j);
        }


    }
}