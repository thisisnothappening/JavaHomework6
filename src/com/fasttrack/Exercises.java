package com.fasttrack;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[7];
        System.out.println("Input array elements:");
        intArray[0] = scanner.nextInt();
        intArray[1] = scanner.nextInt();
        intArray[2] = scanner.nextInt();
        intArray[3] = scanner.nextInt();
        intArray[4] = scanner.nextInt();
        intArray[5] = scanner.nextInt();
        intArray[6] = scanner.nextInt();
        System.out.println(Arrays.toString(intArray));

        System.out.println("\n    EXERCISE 1    \n");
        System.out.println("The sum is " + ex1(intArray) + ".");

        System.out.println("\n    EXERCISE 2    \n");
        System.out.println("The number of odd elements is: " + ex2(intArray));

        System.out.println("\n    EXERCISE 3    \n");
        System.out.println("Input number:");
        int number = scanner.nextInt();
        System.out.println("\nArray elements bigger than your number:");
        ex3(intArray, number);

        System.out.println("\n    EXERCISE 4    \n");
        System.out.println("Input number between 200 and 1000:");
        int target = scanner.nextInt();
        ex4(target);

        System.out.println("\n    EXERCISE 5    \n");
        System.out.println("Input maximum number of donations:");
        int max = scanner.nextInt();
        ex5(target, max);

        System.out.println("\n    EXERCISE 6    \n");
        System.out.println("Input a phrase (at least 2 sentences with '. ' at the end): ");
        scanner.nextLine();
        String phrase = scanner.nextLine();
        ex6(phrase);
    }

    public static int ex1(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public static int ex2(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                sum++;
            }
        }
        return sum;
    }

    public static void ex3(int[] intArray, int number) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > number) {
                System.out.println(intArray[i]);
            }
        }
    }

    public static void ex4(int target) {
        Random random = new Random();
        int donation;
        int sum = 0;

        while (sum < target) {
            donation = random.nextInt(100);
            System.out.println("Donation: " + donation);
            sum += donation;
        }

        System.out.println("SUCCESS! " + "\nYou received: " + sum);
    }

    public static void ex5(int target, int max) {
        Random random = new Random();
        int donation = random.nextInt(100);
        int sum = donation;
        int i = 1;
        System.out.println("Donation: " + donation);

        while (sum < target && i < max) {
            i++;
            sum += donation;
            donation = random.nextInt(100);
            System.out.println("Donation: " + donation);
        }

        System.out.println("SUCCESS! " + "\nYou received: " + sum);
    }

    public static void ex6(String phrase) {
        String[] sentences = phrase.split("\\.");
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].length() != 0 && sentences[i].charAt(0) == ' ') {
                sentences[i] = sentences[i].substring(1);
            }
            System.out.println(sentences[i] + ".");
        }
    }
}
