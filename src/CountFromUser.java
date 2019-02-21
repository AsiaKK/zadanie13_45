import utils.ListUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountFromUser {

    public static void main(String[] args) {
        ListUtils listUtils = new ListUtils();

        List<Integer> list = prepareList();

        listUtils.printInReverseOrder(list);

        listUtils.printSum(list);

        System.out.println("Największa liczba: " + listUtils.findMaxValue(list));
        System.out.println("Najmniejsza liczba: " + listUtils.findMinValue(list));

    }

    private static List<Integer> prepareList() {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int input = 0;

        while (input >= 0) {
            System.out.println("Podaj liczbe: ");
            input = scan.nextInt();
            if (input >= 0) {
                list.add(input);
            }
        }

        scan.close();
        return list;
    }


}