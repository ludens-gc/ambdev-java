package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {
    public static void exec(Scanner in) {
        ArrayList<Integer> input = askInput(in);
        ArrayList<Integer> result = quickSort(input);
        System.out.println("Lista ordenada: " + result);
    }

    private static ArrayList<Integer> askInput(Scanner in) {
        System.out.println("Insira uma lista de números inteiros separados por espaço:");
        String inputString = in.nextLine();
        String[] inputArray = inputString.split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (String num : inputArray) {
            arr.add(Integer.parseInt(num));
        }
        return arr;
    }

    private static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(0);
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }

        ArrayList<Integer> sortedLeft = quickSort(left);
        ArrayList<Integer> sortedRight = quickSort(right);

        ArrayList<Integer> sortedArr = new ArrayList<Integer>();
        sortedArr.addAll(sortedLeft);
        sortedArr.add(pivot);
        sortedArr.addAll(sortedRight);

        return sortedArr;
    }
}
