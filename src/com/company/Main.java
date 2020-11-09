package com.company;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) {
            System.out.println("Give number");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuess) {
                System.out.println("Not Correct");
            } else if (userNumber > numberToGuess) {
                System.out.println("Not Correct");
            } else {
                System.out.println("Correct!");
                wasNumberGuessed = true;
            }
        }
    }
}
