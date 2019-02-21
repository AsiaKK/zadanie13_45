package utils;

import java.util.List;

public class ListUtils {

    public void printInReverseOrder(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Nieparwidłowe wejście");
        }

        System.out.println("\nPrint list in reverse order");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public void printSum(List<Integer> list){
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Nieparwidłowe wejście");
        }

        System.out.println("\nPrint sum of the list");

        int sum = list.get(0);
        System.out.print(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            System.out.print(" + " + list.get(i));
            sum += list.get(i);
        }
        System.out.print("=" + sum +"\n");
    }

    public int findMaxValue(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Nieparwidłowe wejście");
        }

        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public int findMinValue(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Nieparwidłowe wejście");
        }

        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }
}