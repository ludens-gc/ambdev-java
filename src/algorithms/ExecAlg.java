package algorithms;

import java.util.Scanner;

public class ExecAlg {
    public static void exec() {
        Scanner in = new Scanner(System.in);
        boolean wishContinue = false;
        while (!wishContinue) {
            wishContinue = AlgList.exec(in);
        }
        in.close();
    }
}
