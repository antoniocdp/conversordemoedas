import br.com.antoniocdp.conversordemoedas.ConsoleColors;
import br.com.antoniocdp.conversordemoedas.ConversorDeMoedas;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        System.out.println(ConsoleColors.YELLOW_BOLD +"*********************************************");
        System.out.println("**         Seja bem-vindo ao Conversor de Moedas        **");
        System.out.println("*********************************************");

        while (!sair) {
            System.out.println("Selecione uma das opções:");
            System.out.println("1) Dólar  ===>  Dinar do Kuwait");
            System.out.println("2) Dinar do Kuwait  ===>  Dólar");
            System.out.println("3) Dólar  ===>  Dinar do Bahrein");
            System.out.println("4) Dinar do Bahrein  ===>  Dólar");
            System.out.println("5) Dólar  ===>  Rial de Omã");
            System.out.println("6) Rial de Omã  ===>  Dólar");
            System.out.println("7) Dólar  ===>  Dinar da Jordânia");
            System.out.println("8) Dinar da Jordânia  ===>  Dólar");
            System.out.println("9) Dólar  ===>  Libra Esterlina");
            System.out.println("10)Libra Esterlina  ===>  Dólar");
            System.out.println("11)Dólar  ===>  Libra de Gibraltar");
            System.out.println("12)Libra de Gibraltar  ===>  Dólar");
            System.out.println("13)Dólar  ===>  Dólar das Ilhas Cayman");
            System.out.println("14)Dólar das Ilhas Cayman  ===>  Dólar");
            System.out.println("15)Dólar  ===>  Franco Suíço");
            System.out.println("16)Franco Suíço  ===>  Dólar");
            System.out.println("17)Dólar  ===>  Euro");
            System.out.println("18)Euro  ===>  Dólar");
            System.out.println("19)Dólar  ===>  Real Brasileiro");
            System.out.println("20)Real Brasileiro  ===>  Dólar");

            System.out.println("21) Sair");

            System.out.println("Escolha uma opção:");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    converterMoedas(scanner, "USD", "KWD");
                    break;
                case 2:
                    converterMoedas(scanner, "KWD", "USD");
                    break;
                case 3:
                    converterMoedas(scanner, "USD", "BHD");
                    break;
                case 4:
                    converterMoedas(scanner, "BHD", "USD");
                    break;
                case 5:
                    converterMoedas(scanner, "USD", "OMR");
                    break;
                case 6:
                    converterMoedas(scanner, "OMR", "USD");
                    break;
                case 7:
                    converterMoedas(scanner, "USD", "JOD");
                    break;
                case 8:
                    converterMoedas(scanner, "JOD", "USD");
                    break;
                case 9:
                    converterMoedas(scanner, "USD", "GBP");
                    break;
                case 10:
                    converterMoedas(scanner, "GBP", "USD");
                    break;
                case 11:
                    converterMoedas(scanner, "USD", "GIP");
                    break;
                case 12:
                    converterMoedas(scanner, "GIP", "USD");
                    break;
                case 13:
                    converterMoedas(scanner, "USD", "KYD");
                    break;
                case 14:
                    converterMoedas(scanner, "KYD", "USD");
                    break;
                case 15:
                    converterMoedas(scanner, "USD", "CHF");
                    break;
                case 16:
                    converterMoedas(scanner, "CHF", "USD");
                    break;
                case 17:
                    converterMoedas(scanner, "USD", "EUR");
                    break;
                case 18:
                    converterMoedas(scanner, "EUR", "USD");
                    break;
                case 19:
                    converterMoedas(scanner, "USD", "BRL");
                    break;
                case 20:
                    converterMoedas(scanner, "BRL", "USD");
                    break;

                case 21:
                    sair = true;
                    System.out.println("Saindo do Conversor de Moedas!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    public static void converterMoedas(Scanner scanner, String moedaOrigem, String moedaDestino) {
        System.out.println("Digite o valor a ser convertido:");
        double valor = scanner.nextDouble();

        try {
            double valorConvertido = ConversorDeMoedas.converterMoeda(valor, moedaOrigem, moedaDestino);
            System.out.println("********************************************");
            System.out.println(valor + " " + moedaOrigem + " equivalem a " + valorConvertido +
                    " " + moedaDestino);
            System.out.println("********************************************");

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}


