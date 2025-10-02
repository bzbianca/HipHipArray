
/*
Name: Bianca Baccay
Date: 10/2/2025
Description:  Prints the even numbers on one line and the odd numbers on another.
*/

import java.util.Scanner;

public class EvenOddSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayOfInts = new int[15];

        System.out.print("Enter 15 integers with one space between each integer:\n");
        for(int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = input.nextInt();
        }

        int[] newEvens = getEvens(arrayOfInts);
        System.out.print("Even numbers: " );
        for (int even : newEvens) {
            System.out.print(even + " ");
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        int[] newOdds = getOdds(arrayOfInts);
        for (int odd : newOdds) {
            System.out.print(odd + " ");
        }
        System.out.println();

    }

    public static int[] getEvens(int[] nums) {
        int listCounter = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                listCounter += 1;
            }
        }

        int[] evenNums = new int[listCounter];
        int howManyInArray = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                evenNums[howManyInArray] = nums[i];
                howManyInArray += 1;
            }
        }
        return evenNums;
    }

    public static int[] getOdds(int[] nums) {
        int listCounter = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0) {
                listCounter += 1;
            }
        }

        int[] oddNums = new int[listCounter];
        int howManyInArray = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0){
                oddNums[howManyInArray] = nums[i];
                howManyInArray += 1;
            }
        }
        return oddNums;
    }
}

