import java.util.Random;
import java.util.Scanner;

public class crapsGameAssignment {
    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            Random rollOne = new Random();
            Random rollTwo = new Random();
            Scanner answerRoll = new Scanner(System.in);
            System.out.println("Welcome to my Craps game!");
            System.out.println("Hit any key then press enter to roll the die:");
            String input = answerRoll.next();
            if (input.length() == 1) {
                playAgain = false;
            } else {
                System.out.println("Only press one key to roll! This is invalid!: " + input);
            }
            int dieOne = rollOne.nextInt(6) + 1;
            int dieTwo = rollTwo.nextInt(6) + 1;
            int dieSum = dieOne + dieTwo;
            if (dieSum == 2 || dieSum == 3 || dieSum == 12) {
                System.out.println("You rolled: " + dieSum);
                System.out.println("Craps!");
                System.out.println("Play Again? Y/N: ");
                Scanner newGame = new Scanner(System.in);
                String newGameAns = newGame.next();
                if (newGameAns.equalsIgnoreCase("y"))
                    playAgain = true;
                else {
                    System.out.println("Thanks For Playing!");
                    playAgain = false;
                }
            } else if (dieSum == 7 || dieSum == 11) {
                System.out.println("You rolled: " + dieSum);
                System.out.println("You rolled natural! You win!");
                System.out.println("Play again? Y/N: ");
                Scanner newGame = new Scanner(System.in);
                String newGameAns = newGame.next();
                if (newGameAns.equalsIgnoreCase("y")) {
                    playAgain = true;
                } else {
                    System.out.println("Thanks For Playing!");
                    playAgain = false;
                }
            } else {
                Random rollThree = new Random();
                Random rollFour = new Random();
                boolean keepRolling = true;
                System.out.println("You rolled: " + dieSum + "... The Point is: " + dieSum);
                while (keepRolling) {
                    int dieThree = rollThree.nextInt(6) + 1;
                    int dieFour = rollFour.nextInt(6) + 1;
                    int dieTwoSum = dieThree + dieFour;
                    System.out.println("Hit any key to roll the dice!");
                    Scanner answerTwoRoll = new Scanner(System.in);
                    String inputTwo = answerTwoRoll.next();
                    System.out.println("You rolled: " + dieTwoSum + "... The Point is: " + dieSum);
                    if (inputTwo.length() == 1) {
                        playAgain = false;
                    } else {
                        System.out.println("Only press one key to roll!" + input);
                        playAgain = true;
                    }
                    if (dieTwoSum == dieSum) {
                        System.out.println("You rolled: " + dieTwoSum);
                        System.out.println("You Win!");
                        System.out.println("Play again? Y/N: ");
                        Scanner newGame = new Scanner(System.in);
                        String newGameAns = newGame.next();
                        if (newGameAns.equalsIgnoreCase("y")) {
                            keepRolling = false;
                            playAgain = true;
                        } else {
                            System.out.println("See you next time!");
                            playAgain = false;
                        }
                    } else if (dieTwoSum == 7) {
                        System.out.println("You rolled a 7. Sorry, but you lose.");
                        System.out.println("Play again? Y/N: ");
                        Scanner newGame = new Scanner(System.in);
                        String newGameAns = newGame.next();
                        if (newGameAns.equalsIgnoreCase("y"))
                            playAgain = true;
                        else {
                            System.out.println("Thanks For Playing!");
                            playAgain = false;
                        }
                        keepRolling = false;
                    }
                }
            }
        }
    }
}