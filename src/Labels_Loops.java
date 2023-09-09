/*Em Java, é possível usar rótulos (labels) em loops para controlar quais loops devem
  ser interrompidos quando se utiliza a instrução break. Os rótulos são identificadores
  que são colocados antes de loops, e você pode usá-los para especificar qual loop você
  deseja interromper. Isso é especialmente útil quando você tem loops aninhados e deseja
  sair de um loop externo em vez de apenas o loop interno.*/

public class Labels_Loops{
    public static void main(String[]args){

        externo:
        for(int a = 0; a < 5; a++){
            for(int b = 0; b < 5; b++){
                if(a + b == 7){
                    System.out.println("A + B = "+ (a +b));
                    break externo; // Isso irá interromper o loop externo
                }
                System.out.println("B = " + b);
            }
        }

    }
}

/* Neste exemplo, temos um loop externo rotulado como "externo" e um loop
   interno. Quando a condição for atendida dentro do loop interno, o break
   externo; será executado, interrompendo o loop externo marcado com "externo".
 */

/* É importante notar que o uso de rótulos em loops deve ser feito com cuidado,
   pois pode tornar o código menos legível e mais complexo.

   Em geral,é recomendável evitá-los, a menos que você tenha um motivo específico
   para usá-los, como a necessidade de sair de loops aninhados em um contexto
   específico.

   É geralmente preferível encontrar outras formas de estruturar seu código
   para evitar a necessidade de rótulos em loops.
 */