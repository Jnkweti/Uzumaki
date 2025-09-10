package games.blackJackk;
public class blackJackGame {

    static int total = 0;
    static boolean gameOver = false;
    int win = 21;
    static int I = 0;
    public static int totu = 0;
    public static int totC = 0;

    public static String firstDraw = " ";
    public static String secondDraw = " ";
    public static String thirdDraw = " ";
    public static String fourthDraw = " ";
    public static String fifthDraw = " ";
    public static String sixthDraw = " ";
    public static String seventhDraw = " ";
    public static String eigthDraw = " ";

    public static String compfirstDraw = " ";
    public static String compsecondDraw = " ";
    public static String compthirdDraw = " ";
    public static String compFourDraw = " ";
    public static String compFiveDraw = " ";
    public static String hidden = " __ __"
                       + "\n|? X  |" +
                         "\n|X X X|" +
                         "\n|__X_?|";
    
    //this method generates a random cards.
   
    //this method returns the sum of the users cards.
    public static int cal(String one, String two)
    {
        return cardnum(one) + cardnum(two);
    }
    //returns sum for user
    public static int calc()
    {
        return cal(firstDraw, secondDraw);
    }
    //returns sum for dealer
     public static int calcomp()
    {
        int i = cal(compfirstDraw, compsecondDraw);
        
        return i;
    }

    //this method return a random card if the user wants it.
    public static String hit() {
        return randomCardGen();
    }
    //this method prints cards that have been generated.
    public static String draw()
    {
        firstDraw = randomCardGen();
        secondDraw = randomCardGen();
        thirdDraw = randomCardGen();
        fourthDraw = randomCardGen();
        fifthDraw = randomCardGen();
        sixthDraw = randomCardGen();
        seventhDraw = randomCardGen();
        eigthDraw = randomCardGen();
        return  "you get a \n" + firstDraw + "\nand a\n" + secondDraw ;
    }
    public static String moreDraws()
    {
        if(I == 1)
        {
            totu = calc() + cardnum(thirdDraw);
            return  thirdDraw + "\nYour new total is " + totu;

        }
        else if(I == 2)
        {
            totu = calc() + cardnum(fourthDraw) + cardnum(thirdDraw);
            return  fourthDraw + "\nYour new total is " + totu;
        }
        else if(I == 3)
        {
            totu = calc() + cardnum(fourthDraw) + cardnum(thirdDraw) + cardnum(fifthDraw);
            return  fifthDraw + "\nYour new total is " + totu;
        }
        else if(I == 4)
        {
            totu = calc() + cardnum(fourthDraw) + cardnum(thirdDraw) + cardnum(fifthDraw)
            + cardnum(sixthDraw);
            return  sixthDraw + "\nYour new total is " + totu;
        }
        else if(I == 5)
        {
            totu = calc() + cardnum(fourthDraw) + cardnum(thirdDraw) + cardnum(fifthDraw)
            + cardnum(sixthDraw) + cardnum(seventhDraw);
            return  seventhDraw + "\nYour new total is " + totu;
        }
        else if(I == 6)
        {
            totu = calc() + cardnum(fourthDraw) + cardnum(thirdDraw) + cardnum(fifthDraw)
            + cardnum(sixthDraw) + cardnum(seventhDraw) + cardnum(eigthDraw);
            return  eigthDraw + "\nYour new total is " + totu;
        }
        return "thank uou" + I;
    }
    public static void method(int i)
    {
         I = i ;
    }
    //this method prints the dealers hand.
    public static String dealerDraw()
    {
        compfirstDraw = randomCardGen();
        compsecondDraw = randomCardGen();
        compthirdDraw =randomCardGen();
        compFourDraw = randomCardGen();
        compFiveDraw =randomCardGen();
        
       
        return  "the dealer shows\n" + compfirstDraw +
         "\n and the second card is hidden\n" + hidden ;
    }

    public static String dealerReveal()
    {
        total = calcomp();
        totC = total;
         if(total < 17)
        {
            total = calcomp() + cardnum(compthirdDraw);
            totC = total;
            if(total < 17 )
            {
                total = calcomp() + cardnum(compthirdDraw) + cardnum(compFourDraw);
                totC = total;
                return compfirstDraw + "\n" + compsecondDraw + "\n" 
                + compthirdDraw +"\n" + compFourDraw +
                 "\nthe dealers total is " + total + " ";
            }
            return compfirstDraw + "\n" + compsecondDraw + "\n" 
        + compthirdDraw + "\n the dealers total is " + total + " ";
        }
        return compfirstDraw + "\n" + compsecondDraw +  "\nthe dealers total is " + total + " ";
    }
    public static String check()
    {
        if(totC >= 21 || totu >= 21)
        {
            return winner();
        }

        return "";
    }
    public static String winner()
    {
        if ((totu == totC) || (totu > 21 && totC > 21) || (totu == 21 && totC == 21))
        {
            
            return (gameOver = true)  +" \nits a tie" ;
        }
        if((totC == 21) || (totu > 21) || (totC > totu && totC < 21))
        {
            
            return (gameOver = true) +  " \nDealer wins";
        }
        else if((totu == 21) || ((21 - totu) < (21 - totC)))
        {
            
            return (gameOver = true)  + " \nyou win";
        }
         
        return "you win " ;
    }

    
   
    public static String randomCardGen() 
    {
        double random = Math.random() * 12;

        switch ((int) random) {
            case 0:
                return " __ __"
                        + "\n|A O  |" +
                        "\n|O O O|" +
                        "\n|__O_A|" ;
            case 1:
                return " __ __"
                        + "\n|2 O  |" +
                        "\n|O O O|" +
                        "\n|__O_2|" ;
            case 2:
                return " __ __"
                        + "\n|3 O  |" +
                        "\n|O O O|" +
                        "\n|__O_3|" ;
            case 3:
                return " __ __"
                        + "\n|4 O  |" +
                        "\n|O O O|" +
                        "\n|__O_4|";
            case 4:
                return " __ __"
                   + "\n|5 O  |" +
                     "\n|O O O|" +
                     "\n|__O_5|" ;
            case 5:
                return " __ __"
                        + "\n|6 O  |" +
                        "\n|O O O|" +
                        "\n|__O_6|" ;
            case 6:
                return " __ __"
                        + "\n|7 O  |" +
                        "\n|O O O|" +
                        "\n|__O_7|" ;
            case 7:
                return " __ __"
                        + "\n|8 O  |" +
                        "\n|O O O|" +
                        "\n|__O_8|" ;
            case 8:
                return " __ __"
                        + "\n|9 O  |" +
                        "\n|O O O|" +
                        "\n|__O_9|" ;
            case 9:
                return " __ __"
                        + "\n|J O  |" +
                        "\n|O O O|" +
                        "\n|__O_J|" ;
            case 10:
                return " __ __"
                        + "\n|Q O  |" +
                        "\n|O O O|" +
                        "\n|__O_Q|" ;
            case 11:
                return " __ __"
                        + "\n|K O  |" +
                        "\n|O O O|" +
                        "\n|__O_K|" ;

            default:
                return "good game" ;
        }
    }
     //this method calculated the value of a card.
    public static  int cardnum(String one )
    {
        
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
    //this method will translate the cards with letters instead of numbers
    public static int con(String in)
    {
        String i = in;
        int o = 0;
        if(i.equals("K"))
        {
            o = 10;
            return o;
        }
        else if(i.equals("J"))
        {
            o = 10;
            return o;
        }
        else if(i.equals("Q"))
        {
            o = 10;
            return o;
        }

        return 1;
    }
}
