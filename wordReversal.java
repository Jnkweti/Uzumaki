import java.util.Scanner;

public class wordReversal {
    public static void main(String [] args)
    {
        /*this code will take a user's input and reverse it  */

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word:");
        String in = scan.nextLine();

        System.out.println(meth(in));
        


        scan.close();
    }

    public static String meth(String in)
    {
        String ca = "";
        char a = ' ';
        int x = in.length();
        for(;x > 0; )
        {
            a = in.charAt(x - 1);
            ca += a;
            x--;
        }

        return ca;
    }


}
