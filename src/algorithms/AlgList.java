package algorithms;

import java.util.Scanner;

public class AlgList {
    public static boolean exec(Scanner in) {
        int input = askInput(in);
        boolean result = selectAlg(input, in);
        return result;
    }

    private static int askInput(Scanner in) {
        printMenu();
        System.out.println("Selecione um algoritmo para executar:");
        int num = in.nextInt();
        in.nextLine();
        return num;
    }

    public static void printMenu() {
        String menu = "Entregável #1 - Algoritmos\n\n" +
                "Escolha um algoritmo para executar.\n" +
                "Breve explicação de cada algoritmo:\n" +
                "(1) countInt: Conta quantos valores inteiros existem em um conjunto de dados.\n" +
                "(2) cumSum: Soma de um conjunto de números.\n" +
                "(3) fibonacci: Exibe os N primeiros termos da sequência de fibonacci.\n" +
                "(4) gcd: Indica qual é o máximo divisor comum entre 2 números.\n" +
                "(5) isPrime: Indica se o número é primo ou não.\n" +
                "(6) quickSort: Ordena um array usando o método Quicksort.\n" +
                "(7) Sair\n";

        System.out.println(menu);
    }

    private static boolean selectAlg(int num, Scanner in) {
        switch (num) {
            case 1:
                CountInt.exec(in);
                return false;
            case 2:
                CumSum.exec(in);
                return false;
            case 3:
                Fibonacci.exec(in);
                return false;
            case 4:
                GCDCalculator.exec(in);
                return false;
            case 5:
                IsPrime.exec(in);
                return false;
            case 6:
                QuickSort.exec(in);
                return false;
            default:
                System.out.println("Saindo...");
                return true;
        }
    }
}
