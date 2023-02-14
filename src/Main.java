import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Get a move choice from playerA which must be R, P, S or r, p, s
        Loop until you get a valid move
        Get a move choice from playerB in the same manner

        Display the results using the accepted phrases from the game
        Rock breaks Scissors,
        Paper covers Rock,
        Scissors cuts Paper

        and indicate the winner (Player A wins) or
        Rock vs Rock it’s a Tie!  Etc…

        Prompt the user to play again [Y/N]
        Continue or terminate based on the user’s choice.


        To assist in grading the work efficiently, I will ask you to provide
        screen capture shots of your program runs to show that you completed the assigned work.
        Provide the following screen shots:

        INSERT THESE HERE IN THIS DOCUMENT:
        Show the looping when the user fails to enter a valid move.
        Show several completed games and the prompt to play again.

        Note that you may be able to show all of this with one screen shot.
        Just make sure you establish that you correctly coded the program and tested it.
         */

        // input variables
        String playerA;
        String playerB;

        // variables for input checks
        boolean lengthAValid = false;
        boolean lengthBValid = false;

        // loop ender
        boolean gameOver = false;
        int scoreA = 0;
        int scoreB = 0;

        // scanner initialization
        Scanner in = new Scanner(System.in);


        // loop gameplay
        do {

            System.out.println("\uD83E\uDEA8\uD83D\uDCDC✂  Rock, paper, scissors!  \uD83E\uDEA8\uD83D\uDCDC✂\n" +
                    "Player A, it's your move [Enter 'R', 'P', or 'S']:");

            // player A input

            // loops over input until they get it right
            do {

                playerA = in.next(); // store input in variable right away

                // now check length
                if (playerA.length() == 1){ // if input is just 1 character, check if R, P, or S

                    if (playerA.equalsIgnoreCase("R") ||
                            playerA.equalsIgnoreCase("P") ||
                            playerA.equalsIgnoreCase("S")) {

                        // ends loop
                        lengthAValid = true;

                    } else {
                        // if they put something weird, make them try again
                        System.out.println("Please enter only 'R', 'P', or 'S'.");
                    }


                } else {
                    // if they failed the string length check, make them try again
                    System.out.println("Please enter only the first letter of your move (R/P/S):");
                }

            } while (!lengthAValid); // end of player A input


            // player B input

            // loops over input until they get it right
            do {

                playerB = in.next(); // store input in variable right away

                // now check length
                if (playerB.length() == 1){ // if input is just 1 character, check if R, P, or S

                    if (playerB.equalsIgnoreCase("R") ||
                            playerB.equalsIgnoreCase("P") ||
                            playerB.equalsIgnoreCase("S")) {

                        // ends loop
                        lengthBValid = true;

                    } else {
                        // if they put something weird, make them try again
                        System.out.println("Please enter only 'R', 'P', or 'S'.");
                    }


                } else {
                    // if they failed the string length check, make them try again
                    System.out.println("Please enter only the first letter of your move (R/P/S):");
                }

            } while (!lengthBValid); // end of player B input


            // finally compare them

            // first check if they tied
            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("Tie");


                // all other cases:
            } else if (playerA.equalsIgnoreCase("R")) {
                // player A is rock

                if (playerB.equalsIgnoreCase("P")) {
                    // player B is paper
                    System.out.println("Paper covers Rock— Player B wins! \uD83C\uDF89");

                } else {
                    // player B is scissors
                    System.out.println("Rock breaks Scissors— Player A wins! \uD83C\uDF89");
                }

            } else if (playerA.equalsIgnoreCase("P")) {
                // player A is paper

                if (playerB.equalsIgnoreCase("R")) {
                    // player B is rock
                    System.out.println("Paper covers Rock— Player A wins! \uD83C\uDF89");

                } else {
                    // player B is scissors
                    System.out.println("Scissors cuts Paper— Player B wins! \uD83C\uDF89");
                }

            } else {
                // player A is scissors

                if (playerB.equalsIgnoreCase("R")){
                    // player B is rock
                    System.out.println("Rock breaks Scissors— Player B wins! \uD83C\uDF89");

                } else {
                    // player B is paper
                    System.out.println("Scissors cuts Paper— Player A wins! \uD83C\uDF89");
                }
            }
            // end of winner check


            // play again?
            System.out.println("Play again? (Y/N)");

            if (!in.next().equalsIgnoreCase("Y")) {
                gameOver = true;
            }


        } while (!gameOver);


        // end
        // display score?
    }
}