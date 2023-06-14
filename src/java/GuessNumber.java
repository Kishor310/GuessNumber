

/* GuessNumber Game using Swing*/

import javax.swing.*;
public class GuessNumber {

    public static void playGame() {

        int scorePlayer = 0;
        int scoreComputer = 0;
        boolean playAgain = true;

        try {

            while (playAgain) {

                // JOptionPane ==> makes to pop up a standard dialog box that prompts users for
                // a value or informs

                JOptionPane.showMessageDialog(null,
                        "Rules: \n1.Guess the number between 1 and 100" + "\n" + "2.Guess the number within 5 trials");

                int Number = 1 + (int) (100 * Math.random()); // random numbers within 1 to 100
                int guessCount = 0; // Game limit of attempts is 5 
                boolean gameOver = false;

                while (!gameOver && guessCount < 5) {

                    String s = JOptionPane.showInputDialog("Enter your guessed Number");
                    int guess = Integer.parseInt(s); // convert it to a integer

                    guessCount++;

                    if (guess < 1 || guess > 100) {

                        JOptionPane.showMessageDialog(null, "Please Enter Number between 1 to 100 only", "Warning",
                                JOptionPane.WARNING_MESSAGE);

                    }

                    if (guess == Number) {

                        System.out.println("Congratulations, you guessed the number in " + guessCount + " attempts!");
                        JOptionPane.showMessageDialog(null, "Congratulations You win this Game");

                        gameOver = true;
                        scorePlayer++; // counting player score

                    } else if (guess < Number) {
                        JOptionPane.showMessageDialog(null, "Your guessed Number" + guess + " is too low");

                    } else {
                        JOptionPane.showMessageDialog(null, "Your guessd Number" + guess + " is too high");

                    }
                }

                if (!gameOver) {
                    JOptionPane.showMessageDialog(null,
                            "Sorry, you did not guess the number in 5 attempts" + "\n" + "The number was "
                                    + Number);

                    scoreComputer++; // counting Computer Score
                }

                String playAgainInput = JOptionPane.showInputDialog("Do you want to play again? (Yes/No)");
                // playAgain = playAgainInput.equalsIgnoreCase("yes");
                if (playAgain = playAgainInput.equals("Yes")) {
                } else if (playAgain = playAgainInput.equals("No")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter valid Answer between the range ", "Warning",
                            JOptionPane.ERROR_MESSAGE);
                    // break;
                    System.exit(guessCount);
                }

            }

            // Showing score and who is win
            JOptionPane.showMessageDialog(null, "Thanks for playing ! \nYour final score is = " + scorePlayer
                    + " \n" + "The Computer Score is = " + scoreComputer);

            if (scorePlayer < scoreComputer) {

                JOptionPane.showMessageDialog(null, "Computer Win the Game!");

            } else {
                JOptionPane.showMessageDialog(null, "Congratulations You Win the Game!");

            }
            JOptionPane.showMessageDialog(null, "Game Over !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter valid Integer Number", "Warning", JOptionPane.ERROR_MESSAGE);

        }
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello  welcome to the **Number Guessing Game** ");

        playGame(); // function call

    }
}
