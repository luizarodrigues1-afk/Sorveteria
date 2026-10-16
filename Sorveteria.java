import java.util.Scanner;

public class Sorveteria {

    public static void main(String[] args) {
        // Configura o Scanner para usar ponto como separador decimal
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        int qtdBolas = 0;
        int opcao;

        // Loop principal: exibe o menu até que o cliente digite 0
        do {
            System.out.println("===== SORVETERIA =====");
            System.out.println("1 - Chocolate");
            System.out.println("2 - Morango");
            System.out.println("3 - Baunilha");
            System.out.println("4 - Flocos");
            System.out.println();
            System.out.println("0 - Fechar pedido");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            opcao = Scanner.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                    qtdBolas++;
                    System.out.println();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println();
                    break;
            }

        } while (opcao != 0);

        // Processamento final do pedido
        if (qtdBolas == 0) {
            // Caso D: Pedido sem bolas
            System.out.println("Obrigado pela preferência!");
        } else {
            // Casos A e B: Pedidos com 1 ou mais bolas
            double valorTotal = qtdBolas * 3.00;
            double valorFinal = valorTotal;

            System.out.println("Quantidade de bolas: " + qtdBolas);
            System.out.printf(Locale.US, "Valor sem desconto: R$ %.2f%n", valorTotal);

            // Condicional de desconto (3 ou mais bolas -> 15%)
            if (qtdBolas >= 3) {
                double desconto = valorTotal * 0.15;
                valorFinal = valorTotal - desconto;
                System.out.printf(Locale.US, "Desconto (15%%): R$ %.2f%n", desconto);
            }

            System.out.printf(Locale.US, "Valor final: R$ %.2f%n", valorFinal);
            System.out.println("Obrigado pela preferência!");
        }

        Scanner.close();
    }
}