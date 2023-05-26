package algorithms;

import java.util.Scanner;

public class GCDCalculator {
    public static void exec(Scanner in) {
        int[] input = askInput(in);
        int numX = input[0];
        int numY = input[1];
        int result = gcd(numX, numY);
        System.out.println("O MDC entre " + numX + " e " + numY + " é " + result + ".");
    }

    private static int gcd(int numX, int numY) {
        if (numY == 0) {
            return numX;
        }
        return gcd(numY, numX % numY);
    }

    private static int[] askInput(Scanner in) {
        System.out.println("Insira dois números naturais separados por espaço:");
        String input = in.nextLine();
        String[] arrNum = input.split(" ");
        int[] arrInt = new int[arrNum.length];
        for (int i = 0; i < arrNum.length; i++) {
            arrInt[i] = Integer.parseInt(arrNum[i]);
        }
        return arrInt;
    }
}
