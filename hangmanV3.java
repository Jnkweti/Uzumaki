package games.HangMan;
import java.util.Scanner;


public class hangmanV3 extends main 
{
 public static void main(String[] args) 
 {

    Scanner scan = new Scanner(System.in);
    String in;


    main game = new main();
    game.setWord();
    System.out.println(game.getWord());


    System.out.println(game.getMap());
    System.out.println(game.printDashes(game.setDashes()));

   
   // System.out.println(game.checkGame());
     while(gameOver == false)
     {
        System.out.println("Guess a letter:");
        in = scan.nextLine();


        game.setInput(in);
        game.checkWord();

        System.out.println(game.getMap());
        System.out.println(game.showGuess());
        System.out.println(game.printDashes(game.updateDashes()));

        game.checkGame();
     }   
    scan.close();
 }
    
}
