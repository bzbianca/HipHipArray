/*
Name: Bianca Baccay
Date: 10/2/2025
Description: Returns the difference between the largest and smallest numbers.

*/

import java.util.Arrays;
import java.util.Scanner;

public class MaxDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String userInput = input.nextLine();
        String[] numList = userInput.split(" ");
        int[] intNumList = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            intNumList[i] = Integer.parseInt(numList[i]);
        }
        System.out.println("Maximum difference: " + findDiff(intNumList));
    }

    public static int findDiff(int[] intNumList) {
        int biggestDiff = 0;
        for (int i = 0; i < intNumList.length - 1; i++) {
            for (int j = 0; j < intNumList.length; j++) {
                if (intNumList[j] - intNumList[i] > biggestDiff) {
                    biggestDiff = (intNumList[j] - intNumList[i]);
                } else if (intNumList[i] - intNumList[j] > biggestDiff) {
                    biggestDiff = (intNumList[i] - intNumList[j]);
                }
            }
        }
        return biggestDiff;
    }
}
