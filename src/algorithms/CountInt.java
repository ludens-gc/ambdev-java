package algorithms;

import java.util.Scanner;

public class CountInt {
    public static void exec(Scanner in) {
        double[] input = askInput(in);
        int result = countInt(input);
        System.out.println("Total de inteiros é: " + result);

    }

    private static double[] askInput(Scanner in) {
        System.out.println("Insira uma lista de números reais separados por espaço:");
        String input = in.nextLine();
        String[] arrNum = input.split(" ");
        double[] arrDouble = new double[arrNum.length];
        for (int i = 0; i < arrNum.length; i++) {
            arrDouble[i] = Double.parseDouble(arrNum[i]);
        }
        return arrDouble;
    }

    private static int countInt(double[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isInteger(arr[i])) {
                count++;
            }
        }
        return count;
    }

    private static boolean isInteger(double num) {
        String str = Double.toString(num);
        int index = str.indexOf(".");
        for (int i = index + 1; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }
}
