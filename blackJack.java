package games.blackJackk;

import java.util.Scanner;



public class blackJack {
    public static void main(String[] args) {    
        

        Scanner scan = new Scanner(System.in);
        //double random = Math.random() * 13;
        //System.out.println((int)random);
        boolean turnOver = false;
        String userCard = randomCardGen();
        String userCardTwo = randomCardGen();
        String userCardThree = " ";
        String userCardFour = " ";
        String userCardFive = " ";
        //String hit = randomCardGen();
        String compCard = randomCardGen();
        String compCardTwo = randomCardGen();
        String compCardThree = " ";
        String compCardFour = " ";
        String compCardFive = " ";
        //int chance = deal();
        int compTotal = 0;
        int total = 0;
        String answer = " ";
        String hid = " __ __"
                 + "\n|? X  |" +
                   "\n|X X X|" +
                   "\n|__X_?|" ;

        System.out.println("Press enter if you want to play:");
        String in = scan.nextLine();
        if(!in.equals(""))
        {
            
            System.out.println("maybe next time.");
        }
        else
        {
            System.out.println("Welcome to blackjack!!");

            total = total(userCard) + total(userCardTwo);

            System.out.println(userCard + "\n" + userCardTwo + "\n your total is " + total);
            System.out.println("the dealer shows \n");
            System.out.println(compCard + "\n and \n" + hid + " \nthe second one is hidden so the dealers total is unknown");
            compTotal = total(compCard) + total(compCardTwo);
            System.out.println("do you want to hit or stay?");
            answer = scan.nextLine();
            if (answer.equals("stay")) 
            {
                if(compTotal < 17)
                {
                    compCardThree = hit();
                    compTotal += total(compCardThree);
                }
                if(compTotal < 17)
                {
                    compCardFour = hit();
                    compTotal += total(compCardFour);
                }
                /*if(compTotal < 17)
                {
                    compCardFive = hit();
                    compTotal += total(compCardFive);
                }*/
                else{
                    System.out.println("the dealers cards are ");
                    System.out.println(compCard + "\n" + compCardTwo + "\n" + compCardThree + "\n" + compCardFour + "\n" + compCardFive);
                    System.out.println("\nthe dealers total is " + compTotal);
                    System.out.println(whoWins(total, compTotal));
                }
                
                
            }
            
            else 
            {
                turnOver = false;
                while (turnOver = false) 
                {
                    
                    userCardThree = hit();
                    total += total(compCardThree);
                    System.out.println(compCard + "\n" + compCardTwo + "\n" + compCardThree + "\n" + compCardFour + "\n" + compCardFive);
                    if(total > 21)
                    {
                        System.out.println("you lose, your total is " + total);
                        turnOver = true;
                    }
                    System.out.println(" your total is " + total + "\nhit or stay");
                    answer = scan.nextLine();
                    if(answer.equals("Stay"))
                    {
                        System.out.println("the dealers cards are ");
                        System.out.println(compCard + "\n" + compCardTwo + "\n" + compCardThree + "\n" + compCardFour + "\n" + compCardFive);
                        System.out.println("the dealers total is " + compTotal);
                        System.out.println(whoWins(total, compTotal));
                        turnOver = true;
                    }
                    else
                    {
                        userCardFour = hit();
                        total += total(compCardThree);
                        System.out.println(compCard + "\n" + compCardTwo + "\n" + compCardThree + "\n" + compCardFour + "\n" + compCardFive);
                        if(total > 21)
                        {
                            System.out.println("you lose, your total is " + total);
                            turnOver = true;
                        }
                        System.out.println(" your total is " + total + "\nhit or stay");
                        answer = scan.nextLine();
                    }

                }
                

            }
            
        }
        
      
        
        scan.close();
    }
    public static String hit()
    {
        return randomCardGen();
    }

    public static String whoWins(int total, int compTotal)
    {
       
        if(compTotal > 21 )
        {
            if(total <= 21)
            {
                return "you win!! Dealer Loses.";
            }
            else if( total > 21)
            {
                return "that's a bust, you lose!";
            }
            else if(total == compTotal)
            {
                return "Dealer wins(don't ask me how)";
            }
            return "you win!! the dealer looses";
        }
        else if (compTotal == 21)
        {
            return "The dealer wins";
        }
        if(compTotal < 21 && total < 21)
        {
            if(compTotal > total){
                return "you lose";
            }
            else{
                return "you win";
            }

        }
        return "jks";
    }

    public static int deal()
    {
        double chance = Math.random() * 2;
        return (int)chance;
    }

    public static String randomCardGen()
    {
        double random = Math.random() * 12;

        switch((int)random)
        {
            case 0 : return " __ __"
                        + "\n|A O  |" +
                          "\n|O O O|" +
                          "\n|__O_A|" ;
            case 1 : return " __ __"
                        + "\n|2 O  |" +
                          "\n|O O O|" +
                          "\n|__O_2|" ;
            case 2 : return " __ __"
                        + "\n|3 O  |" +
                          "\n|O O O|" +
                          "\n|__O_3|" ;
            case 3 : return " __ __"
                        + "\n|4 O  |" +
                          "\n|O O O|" +
                          "\n|__O_4|" ;
            case 4 : return " __ __"
                        + "\n|5 O  |" +
                          "\n|O O O|" +
                          "\n|__O_5|" ;
            case 5 : return " __ __"
                        + "\n|6 O  |" +
                          "\n|O O O|" +
                          "\n|__O_6|" ;
            case 6 : return  " __ __"
                         + "\n|7 O  |" +
                           "\n|O O O|" +
                           "\n|__O_7|" ;
            case 7 : return  " __ __"
                         + "\n|8 O  |" +
                           "\n|O O O|" +
                           "\n|__O_8|" ;
            case 8 : return " __ __"
                        + "\n|9 O  |" +
                          "\n|O O O|" +
                          "\n|__O_9|" ;
            case 9 : return  " __ __"
                         + "\n|J O  |" +
                           "\n|O O O|" +
                           "\n|__O_J|" ;
            case 10 : return " __ __"
                         + "\n|Q O  |" +
                           "\n|O O O|" +
                           "\n|__O_Q|" ;
            case 11 : return " __ __"
                         + "\n|K O  |" +
                           "\n|O O O|" +
                           "\n|__O_K|" ;
            
                          
            default : return (int)random + "oh oh";
        }
       
    }

    public static int total(String one )
    {
        /*this method will find the sum of the users cards */
        String on = one;
        int i = 0;
        if(on.substring(8,9).equals("K") || 
        on.substring(8, 9).equals("Q") || on.substring(8, 9).equals("J") || 
        on.substring(8, 9).equals("A") )
        {
            i = con(on.substring(8, 9));
            return i;
        }
        else {
            i = Integer.parseInt(on.substring(8, 9));
            return i;
        }

         

        
    }
    public static int con(String in)
    {
        String i = in;
        int o = 0;
        if(i.equals("K"))
        {
            o = 12;
            return o;
        }
        else if(i.equals("J"))
        {
            o = 10;
            return o;
        }
        else if(i.equals("Q"))
        {
            o = 11;
            return o;
        }

        return 1;
    }
}
