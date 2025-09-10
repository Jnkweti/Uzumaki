package games.blackJackk;
import java.util.Scanner;


public class blackjackv2 extends blackJackGame {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.println(totC);
        String input = null;
        int hit = 0;
        int i = 0;
        String user = null;
        gameOver = false;
        //System.out.println(game.hit());
        System.out.println("welcome to blackjack!! \nif you want to play"
        + " hit enter");
        input = scan.nextLine();
        user = draw();
        System.out.println(user);

        System.out.println("your total is " + calc() + check());
        hit = calc();
        System.out.println(dealerDraw());
        System.out.println("do you want to hit or stay?" );
        input = scan.nextLine();
        if(input.equals("stay"))
        {
            System.out.println("your total is " + hit + "\nthe dealers cards are");
            System.out.println(dealerReveal() + winner());
        }
        else if (input.equals("hit"))
        {
            i++;
            method(i);
            System.out.println( moreDraws());
            System.out.println(check());
            if(gameOver == true)
            {
                System.out.println("\n" +dealerReveal());
                System.exit(0);
            }
                
            System.out.println("do you wanna hit or stay?");
            input = scan.nextLine();
            if(input.equals("hit"))
            {
                i++;
                method(i);
                System.out.println( moreDraws());
                System.out.println(check());
                if(gameOver == true)
                {
                    System.out.println("\n" + dealerReveal());
                    System.exit(0);
                }
                System.out.println("do you wanna hit or stay?");
                input = scan.nextLine();
                if(input.equals("hit"))
                {
                    i++;
                    method(i);
                    System.out.println( moreDraws());
                    System.out.println(check()); 
                    if(gameOver == true)
                    {
                        System.out.println("\n" +dealerReveal());
                        System.exit(0);
                    }
                    System.out.println("do you wanna hit or stay?");
                    input = scan.nextLine();
                    if(input.equals("hit"))
                    {
                        i++;
                        method(i);
                        System.out.println( moreDraws());
                        System.out.println(check()); 
                        if(gameOver == true)
                        {
                            System.out.println("\n" +dealerReveal());
                            System.exit(0);
                        }
                        System.out.println("do you wanna hit or stay?");
                        input = scan.nextLine();
                        if(input.equals("hit"))
                        {
                            i++;
                            method(i);
                            System.out.println( moreDraws());
                            System.out.println(check()); 
                            if(gameOver == true)
                            {
                                System.out.println("\n" +dealerReveal());
                                System.exit(0);
                            }
                            

                        }
                        else
                        {
                            System.out.println("your total is \n" + moreDraws() + "\nthe dealers cards are");
                            System.out.println(dealerReveal() + winner());
                        }


                    }
                    else
                    {
                        System.out.println("your total is \n" + moreDraws() + "\nthe dealers cards are");
                        System.out.println(dealerReveal() + winner());
                    }

                }
                else
                {
                    System.out.println("your total is \n" + moreDraws() + "\nthe dealers cards are");
                    System.out.println(dealerReveal() + winner());
                }
            }
            else
            {
                System.out.println("your total is \n" + moreDraws() + "\nthe dealers cards are");
                System.out.println(dealerReveal() + winner());
            }
           
           
            
        }
        //System.out.println(hit);
        scan.close();
        
    }
    
    
   
}
