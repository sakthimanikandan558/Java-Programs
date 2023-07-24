package SRack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkillRack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] numbersArray = input.split("\\s+");
        int[] numbers = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
        }

        divideNumbers(numbers);
    }

    private static void divideNumbers(int[] numbers) {
        double average = calculateAverage(numbers);
        List<Integer> group1 = new ArrayList<>();
        List<Integer> group2 = new ArrayList<>();
        double currentSum = 0;

        for (int num : numbers) {
            if (currentSum + num <= average) {
                group1.add(num);
                currentSum += num;
            } else {
                group2.add(num);
            }
        }

        printGroups(group1);
        printGroups(group2);
    }

    private static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    private static void printGroups(List<Integer> group) {
        for (int i = 0; i < group.size(); i++) {
            System.out.print(group.get(i));
            if (i != group.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}