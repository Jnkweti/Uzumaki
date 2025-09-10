import java.util.Scanner;


public class anagram {
    public static void main(String [] args)
    {
        /*this code is created to determine if a user input is a anagram( an anagram is two words that have the exact same letters in 
        a different arrangement.)
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("type a word");
        String user = scan.nextLine();

        System.out.println("type a word and I will tell you if it is an anagram");
        String user2 = scan.nextLine();

        char a = ' ';
        
        String hold = " ";
       
        // this code checks to make sure that the user inputs are the same length
        if(user.length() != user2.length())
        {
            System.out.println("these two words are not anagrams");
        }
        //this loop
        for(byte x = 0; x < user.length(); x++)
        {
            
            a = user.charAt(x);

            hold = Character.toString(a);
            if(user2.contains(hold) == true)
            {
                
                if(x == user.length() -1)
                {
                    System.out.println("these words are anagrams");
                }

                continue;
            }
            else
            {
                System.out.println("these words are not anagrams");
                break;
            }
            //System.out.println(a);
          
        }

        //System.out.println("these words are anagrams");

        scan.close();
    }
}
