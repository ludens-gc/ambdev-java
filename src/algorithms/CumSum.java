package algorithms;

import java.util.Scanner;

public class CumSum {
    public static void exec(Scanner in) {
        int[] input = askInput(in);
        int result = cumSum(input);
        System.out.println("Total da soma: " + result);
    }

    private static int[] askInput(Scanner in) {
        System.out.println("Insira uma lista de números inteiros separados por espaço:");
        String input = in.nextLine();
        String[] arrNum = input.split(" ");
        int[] arrDouble = new int[arrNum.length];
        for (int i = 0; i < arrNum.length; i++) {
            arrDouble[i] = Integer.parseInt(arrNum[i]);
        }
        return arrDouble;
    }

    private static int cumSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
