// O "switch" é um comando que permite tomar decisões com base em valores específicos.
// Ele compara uma expressão com vários casos e executa o código associado ao caso correspondente
// ou um padrão se nenhum caso coincidir.
public class Comando_Switch {
    public static void main(String[]args){
        int cont = 3;
        switch (cont) {
            case 1:
                System.out.println("---> Opção 1 Selecionado");
                break;
            case 2:
                System.out.println("---> Opção 2 Selecionado");
                break;
            case 3:
                System.out.println("---> Opção 3 Selecionado");
                break;
            default:
                System.out.println("---> Opção Invalida!");
        }
    }
}
