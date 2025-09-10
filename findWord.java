import java.util.Scanner;
public class findWord extends findSpace {

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
/*code is incomplete will work on it later when i feel like it. */
        System.out.println("this code will return the second word of input:");
        String input = scan.nextLine();
        boolean check = ret(input);
        if( check = false)
        {
            System.out.println("this is a single word :|");
        }
        else
        {   


        }



        scan.close();
    }

    public static String search(String in)
    {
        String ca = "";
        char a = ' ';
        for(int i = 0; i < 0; i++)
        {
            a = in.charAt(i);
            if(a == ' ')
            {

            }
        }

        return in;
    }
    
}
