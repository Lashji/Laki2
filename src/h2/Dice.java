/*
 * Exercise 2, Question 1.
 *
 * Introduction to Programming II, Autumn 2018.
 *
 * Jorma Laurikkala, jorma.laurikkala@uta.fi.
 *
 * Trying to roll a dice once by using an operation.
 *
 */

public class Dice {

    /* Rolls a six-sided dice once.
     */
    public static void rollDice() {
        // Roll the dice by selecting randomly an integer between 1 - 6.
        int sideNumber = (int) (6 * Math.random()) + 1;

        // Print the side number.
        System.out.println("Rolled: " + sideNumber + ".");

    }

    //    Ohjelma kutsuu uutta main operaatiota rollDice operaatiosta, joka aiheuttaa infinite loopin.
    public static void main(String[] args) {
        // Greet the user and inform him/her or her/him of what is happening.
        System.out.println("Hello! I roll a dice once.");

        // Call the operation.
        rollDice();
    }
}