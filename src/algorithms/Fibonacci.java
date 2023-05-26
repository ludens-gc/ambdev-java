package algorithms;

import java.util.Scanner;

public class Fibonacci {
    public static void exec(Scanner in) {
        int input = askInput(in);
        int[] result = fibonacci(input);
        System.out.print("A sequência de Fibonacci com " + input + " termos é: " + showFibonacci(result));
    }

    private static int askInput(Scanner in) {
        System.out.print("Insira o número de termos: ");
        int num = in.nextInt();
        return num;
    }

    private static int[] fibonacci(int num) {
        int[] seq = new int[num];
        if (num <= 0) {
            return new int[0];
        } else if (num == 1) {
            seq[0] = 0;
        } else if (num >= 2) {
            seq[0] = 0;
            seq[1] = 1;
            for (int i = 2; i < num; i++) {
                seq[i] = seq[i - 1] + seq[i - 2];
            }
        }
        return seq;
    }

    private static String showFibonacci(int[] arr) {
        String seqFib = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                seqFib += arr[i];
            } else {
                seqFib += arr[i] + " ";
            }
        }
        seqFib += "\n";
        return seqFib;
    }
}
