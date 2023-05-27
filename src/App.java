import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int iteracaoAtual = 0;
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        while (iteracaoAtual < 3) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            soma = soma + numero;
            iteracaoAtual++;
            
        }
        System.out.println("Foram digitados: " + iteracaoAtual + " numeros. E o acumulado atual é: " + soma);
        sc.close();
    }
}
