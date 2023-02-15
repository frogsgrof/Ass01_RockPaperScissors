import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // input variables
        String playerA;
        String playerB;

        // variables for input checks
        boolean validA;
        boolean validB;

        // loop ender
        boolean gameOver = false;
        int scoreA = 0;
        int scoreB = 0;

        // scanner initialization
        Scanner in = new Scanner(System.in);


        // loop gameplay
        do {

            // reset input variables
            playerA = "reset";
            playerB = "reset";
            validA = false;
            validB = false;


            // print title
            System.out.println("\uD83E\uDEA8\uD83D\uDCDC✂  Rock, paper, scissors!  \uD83E\uDEA8\uD83D\uDCDC✂\n\n" +
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
                        validA = true;

                    } else {
                        // if they put something weird, make them try again
                        System.out.println("Please enter only 'R', 'P', or 'S'.");
                    }


                } else {
                    // if they failed the string length check, make them try again
                    System.out.println("Please enter only the first letter of your move (R/P/S):");
                }

            } while (!validA); // end of player A input


            // player B input

            System.out.println("Player B, it's your move [Enter 'R', 'P', or 'S']:");

            // loops over input until they get it right
            do {

                playerB = in.next(); // store input in variable right away

                // now check length
                if (playerB.length() == 1){ // if input is just 1 character, check if R, P, or S

                    if (playerB.equalsIgnoreCase("R") ||
                            playerB.equalsIgnoreCase("P") ||
                            playerB.equalsIgnoreCase("S")) {

                        // ends loop
                        validB = true;

                    } else {
                        // if they put something weird, make them try again
                        System.out.println("Please enter only 'R', 'P', or 'S'.");
                    }


                } else {
                    // if they failed the string length check, make them try again
                    System.out.println("Please enter only the first letter of your move (R/P/S):");
                }

            } while (!validB); // end of player B input



            // finally compare them

            if (playerA.equalsIgnoreCase("R")) {
                // player A is rock

                System.out.print("\uD83E\uDEA8 v. "); // prints rock emoji for style


                if (playerB.equalsIgnoreCase("R")) {
                    // player B is rock
                    System.out.println("\uD83E\uDEA8\n" +
                            "Tie");

                } else if (playerB.equalsIgnoreCase("P")) {
                    // player B is paper
                    System.out.println("\uD83D\uDCDC\n" +
                            "Paper covers Rock— Player B wins! \uD83C\uDF89");
                    scoreB ++; // +1 to player B score

                } else {
                    // player B is scissors
                    System.out.println("✂\n" +
                            "Rock breaks Scissors— Player A wins! \uD83C\uDF89");
                    scoreA ++; // +1 to player A score
                }


            } else if (playerA.equalsIgnoreCase("P")) {
                // player A is paper

                System.out.print("\uD83D\uDCDC v. "); // prints paper emoji for style


                if (playerB.equalsIgnoreCase("R")) {
                    // player B is rock
                    System.out.println("\uD83E\uDEA8\n" +
                            "Paper covers Rock— Player A wins! \uD83C\uDF89");
                    scoreA ++; // +1 to player A score

                } else if (playerB.equalsIgnoreCase("P")) {
                    // player B is paper
                    System.out.println("\uD83D\uDCDC\n" +
                            "Tie");

                } else {
                    // player B is scissors
                    System.out.println("✂\n" +
                            "Scissors cuts Paper— Player B wins! \uD83C\uDF89");
                    scoreB ++; // +1 to player B score

                }


            } else {
                // player A is scissors

                System.out.print("✂ v. ");


                if (playerB.equalsIgnoreCase("R")){
                    // player B is rock
                    System.out.println("\uD83E\uDEA8\n" +
                            "Rock breaks Scissors— Player B wins! \uD83C\uDF89");
                    scoreB ++; // +1 to player B score

                } else if (playerB.equalsIgnoreCase("P")){
                    // player B is paper
                    System.out.println("\uD83D\uDCDC\n" +
                            "Scissors cuts Paper— Player A wins! \uD83C\uDF89");
                    scoreA ++; // +1 to player A score

                } else {
                    // player B is scissors
                    System.out.println("✂\n" +
                            "Tie");

                }
            }
            // end of winner check


            // super long leaderboard output
            // but doesn't print it if neither of them has any points
            if (!(scoreA == 0 && scoreB == 0)) {
                System.out.println("\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n  SCOREBOARD\n  " +
                        "Player A: " + scoreA + "\n  " +
                        "Player B: " + scoreB + "\n" +
                        "▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄\n\n");
            }


            // play again?
            System.out.println("Play again? (Y/N)");

            if (!in.next().equalsIgnoreCase("Y")) {
                gameOver = true;
            }


        } while (!gameOver);
        // end game loop



        // terminate
        System.out.println("See you next time!");
        System.exit(0);
    }
}