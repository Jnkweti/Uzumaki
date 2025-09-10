package games;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        String choice = "";
        int num;
        
        int compNum;
        System.out.print("This is a game of rock, paper, scissors, prepare to begin." + 
        "\n pick (rock) (paper) or (scissors):");
        choice = scan.nextLine();
        
        //a:
        for(int i = 0; i <= 100; i++)
        {
            
            compNum = (int) (Math.random()*(4-1)) + 1;
            //System.out.println(compNum);
            switch(choice)
            {
                case "rock": num = 1;
                    if(compNum == 2 )
                    {
                        System.out.println("you win");
                        System.out.println("Computer chose scissors");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                        break;
                    }
                    else if(num == compNum)
                    {
                        System.out.println("you tie");
                        System.out.println("Computer chose rock");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                        break;
                    }
                    else if (compNum == 3 )
                    {
                        System.out.println("you lose");
                        System.out.println("Computer chose paper");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                        break;
                    }
                    
                case "scissors": num = 2;
                    if(compNum == 1 )
                    {
                        System.out.println("you lose");
                        System.out.println("Computer chose rock");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                        break;
                    }
                    else if(num == compNum)
                    {
                        System.out.println("you tie");
                        System.out.println("Computer chose scissors");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                        break;
                    }
                    else if (compNum == 3 )
                    {
                        System.out.println("you win");
                        System.out.println("Computer chose paper");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                        break;
                    }
                    
                case "paper": num = 3;
                    if( compNum == 2 )
                    {
                        System.out.println("you lose");
                        System.out.println("Computer chose scissors");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                        break;
                    }
                    else if(num == compNum)
                    {
                        System.out.println("you tie");
                        System.out.println("Computer chose paper");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                        break;
                    }
                    else if ( compNum == 1  )
                    {
                        System.out.println("you win");
                        System.out.println("Computer chose rock");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                        break;
                    }
                case "stop":System.out.println("thank you for playing");
                    i = 100;
                    break ;
                default: 
                        System.out.println("try again.");
                        System.out.println("Choose rock paper or scissors:");
                        choice = scan.nextLine();
                 //break a;       
                    
                

            }
            
        }
        
        scan.close();
    
    }
    
}
