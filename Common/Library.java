/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Library {

   public int getUserInput(String prompt, int minValue, int maxValue) {
        int userInput = -1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt + ": ");
            try {
                String inputString = scanner.nextLine();
                userInput = Integer.parseInt(inputString);
                if (userInput >= minValue && userInput <= maxValue) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + minValue + " and " + maxValue);
            }
        }
        return userInput;
    }

    public int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }
}
