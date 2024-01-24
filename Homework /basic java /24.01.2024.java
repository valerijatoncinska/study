// ЗАДАЧА 1. Currency Converter, использующий зафиксированные курсы валют
// --------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

class CurrencyConverterButBetter {
    public static void main(String[] args) {
        String originalCurrency;

        do {
            System.out.println(
                    "Приветствуем в CurrencyConverter!\n\n" +
                            "Выберите исходную валюту и напишите её название:\n\n" +
                            "EURO\n" +
                            "USD\n" +
                            "TL\n\n" +
                            "Если вы желаете закончить операцию, напишите EXIT\n\n");

            Scanner chosenCurrency = new Scanner(System.in);
            originalCurrency = chosenCurrency.nextLine();
            double x;

            switch (originalCurrency) {
                case "EURO":
                    System.out.println("\nПеревести Евро\n\n");
                    x = 1.0;
                    break;
                case "USD":
                    System.out.println("\nПеревести доллары США\n\n");
                    x = 0.92;
                    break;
                case "TL":
                    System.out.println("\nПеревести турецкие лиры\n\n");
                    x = 0.03;
                    break;
                case "EXIT":
                    System.out.println("\nВы вышли из программы CurrencyConverter.\n\n");
                    continue;
                default:
                    System.out.println("\nВы ввели неверную валюту.\n\n");
                    continue;
            }

            System.out.println(
                    "Выберите целевую валюту и напишите её название:\n\n" +
                            "EURO\n" +
                            "USD\n" +
                            "TL\n\n");

            String targetCurrency = chosenCurrency.nextLine();

            switch (targetCurrency) {
                case "EURO":
                    System.out.println("\nПеревести Евро\n\n");
                    targetCurrency = "EURO";
                    break;
                case "USD":
                    System.out.println("\nПеревести доллары США\n\n");
                    targetCurrency = "USD";
                    break;
                case "TL":
                    System.out.println("\nПеревести турецкие лиры\n\n");
                    targetCurrency = "TL";
                    break;
                case "EXIT":
                    System.out.println("\nВы вышли из программы CurrencyConverter.\n\n");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("\nВы ввели неверную валюту.\n\n");
                    System.exit(-1);

            }
            System.out.print("Введите сумму перевода: ");
            double sum = chosenCurrency.nextDouble();

            double y;

            if (targetCurrency.equals("EURO")) {
                y = 1.0;
            } else if (targetCurrency.equals("USD")) {
                y = 0.92;
            } else {
                y = 0.03;
            }

            double total = sum * x / y;

            System.out.print("\nВы получите: ");
            System.out.println(total);

        } while (!originalCurrency.equals("EXIT"));
    }
}
