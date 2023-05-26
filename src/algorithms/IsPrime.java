package algorithms;

import java.util.Scanner;

public class IsPrime {
    public static void exec(Scanner in) {
        int input = askInput(in);
        boolean result = isPrime(input);
        System.out.println(result ? "O número " + input + " é primo" : "O número " + input + " não é primo");
    }

    private static int askInput(Scanner in) {
        System.out.println("Insira um número:");
        int num = in.nextInt();
        return num;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
