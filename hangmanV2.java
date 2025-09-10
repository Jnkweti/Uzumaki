package games.HangMan;
import java.util.Scanner;


public class hangmanV2 extends hangmanmain {
    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        String input = "";
        getWord();
        getDash();
        System.out.println(printArray(dashMap));
        inputwordArray();
        System.out.println(printArray(wordArray));

        //a:
        {
            System.out.println(  progress(0) + "\ndo you want to play hangman? Y/N");
            input = scan.nextLine();
            
            if( input.equalsIgnoreCase("n"))
            {
                System.out.println("OK, maybe next time.");
                
                
            }
            else
            {
                System.out.println(printArray(dashMap) + "\nGuess a letter:");
                input = scan.nextLine();
                System.out.println(check(input));
                if(chek == false)
                {
                    System.out.println(progress(miss) + "\n" + save(input));
                    
                    
                }
                else
                {
                    updateDashes(wordArray, dashMap, input);
                    
                    
                }

                while(solve == false)
                {
                    if(printArray(dashMap).equals(chosen))
                    {
                        System.out.println("Game Over, You Win!!");
                        break;
                    }
                    if(chek == true)
                    {
                        System.out.println(progress(miss));
                        System.out.print( save(input)+"\n");
                    }
                    System.out.println(printArray(dashMap) + "\nguess a another letter:");
                    input = scan.nextLine();
                    System.out.println(check(input));
                    if(chek == false)
                    {
                        if(miss > 6)
                        {
                            System.out.println("game over you have been hanged! :(");
                            break;
                        }
                        else if(printArray(dashMap).equals(chosen))
                        {
                            System.out.println("Game Over, You Win!!");
                            break;
                        }
                        System.out.println(progress(miss) + "\n {" + save(input) + "}");
                    
                        
                    }
                    else
                    {
                        if(miss > 6)
                        {
                            System.out.println("game over you have been hanged! :(");
                            break;
                        }
                        else if(printArray(dashMap).equals(chosen))
                        {
                            System.out.println("Game Over, You Win!!");
                            break;
                        }
                        updateDashes(wordArray, dashMap, input);

                        //System.out.print(save(input));
                        
                    }

                }



            }
        
            
        }
        scan.close();

        
    }
}
