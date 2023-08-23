public class Criando_Variaveis {
    public static void main(String[]args){
        String nome;
        int idade;
        double altura = 1.75;
        int idadeAnoQueVem;
        boolean estudante = true;
        char sexo = 'm';

        nome = "Lucas";
        idade = 26;
        idadeAnoQueVem = idade + 1;

        System.out.println("nome:"+nome);
        System.out.println("idade:"+idade);
        System.out.println("Altura:"+altura);
        System.out.println("Sexo:"+sexo);
        if (estudante == true) {
            System.out.println("Estudante:sim");
        }else{
            System.out.println("Estudante:não");
        }
    }
}

