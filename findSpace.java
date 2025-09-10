import java.util.Scanner;

public class findSpace {

    public static void main(String [] args)
    {
        /*this code will find out if there is a space in the user input */
        Scanner scan = new Scanner(System.in);

        System.out.println("this code check if you have a space in you input  \nso input somthing");
        String input = scan.nextLine();

        System.out.println(ret(input) + " your input does have a space.");


        scan.close();

    }
    public static boolean ret(String in)
    {
        //String input = in;
        char a =' ';
        for(byte i = 0; i < in.length(); i++)
        {
            a = in.charAt(i);
            if (a == ' ')
            {
                return true;
            }

        }
        return false;
    }
    
}
