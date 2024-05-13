import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        //entrada dos parametros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //explicando o motivo do erro com a frase: "O segundo parâmetro deve ser maior que o primeiro"
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validando se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        //realizando o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i ++) {
            System.out.println(parametroUm + i);
        }
    }
}