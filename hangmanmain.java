package games.HangMan;

public class hangmanmain {
    //this array will hold the chosen word in a letter by letter.
    static String [] build ; 

   //this variable determines whether or not the puzzle has been solved
    static boolean solve = false;

    //this shows the dashes
    static String[] dashMap;
    
    //counts the number of misses
    static int miss = 0;

    static boolean chek = false;

    //saves misses
    static String wrong = "";

    //this puts the chosen map into an array
    static String[] wordArray;
    
    //this variable will hold the initial map
    static String map = "+------+\n" +
                        "|      |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        "----------------\n" +
                        "----------------\n";

    // this variable will hold the randomly generated word
    static String chosen = "";

    //this is a array containing a list of words that will randomly be chosen.
         
        

            static String[] words = {
            "placeholder","ardvark", "alligator","alpaca","anaconda","ant","anteater","antelope"
            , "aphid","armadillo","asp","ass","baboon","badger","bald Eagle","barracuda"
            ,"bass","basset hound","bat" ,"bearded dragon", "beaver" ,"bedbug","bee",
            "bee-eater" ,"bird" ,"bison" ,"black panther","black Widow Spider"
            ,"blue Jay" ,"blue Whale", "bobcat" ,"bufalo" ,"butterfly"
            , "buzzard" , "camel" , "canada Lynx" , "carp", "cat"  ,"caterpillar" , "catfish" , "cheetah" , "chicken"
            , "chimpanzee", "chipmunk" , "cobra" , "cod" ,"condor" , "couga" , "cow" , "coyote" , "crab" ,
            "crane fly" , "cricket" , "crocodile"  , "crow"  , "cuckoo" , "deer"  ,"dinosaur"  ,"dog"  ,"dolphin" ,"donkey"
            ,"dove"     ,"dragonfly" ,"duck" ,"eagle"  ,"eel"  ,"elephant"  , "emu"  , "falcon"
            , "ferret", "finch" , "fish" , "flamingo" , "flea", "fly"  , "fox" , "frog"  , "goat"
            , "goose"   , "gopher"   , "gorilla" , "guinea Pig"    , "hamster"   , "hare" , "hawk"
            ,"hippopotamus","horse","hummingbird" ,"humpback Whale","husky","iguana","impala", "kangaroo" ,"lemur"
            , "leopard", "lion" ,"lizard","llama" ,"lobster" ,"margay","monitor lizard","monkey", "moose", "mosquito", "moth"
            , "mountain mebra" , "mouse", "mule" , "octopus" , "orca" , "ostrich" , "otter" , "owl"  , "oyster" , "panda"
            , "parrot"  , "peacock" , "pelican" , "penguin" , "perch",  "pheasant", "pig", "pigeon", "polar bear" ,"porcupine"
            , "quaga" ,"rabit" , "racoon" , "rat", "rattlesnake"  ,"red wolf" , "rooster" , "seal" , "sheep"  ,"skunk"
            , "sloth", "snake", "spider" , "tiger", "whale" , "wolf", "wombat" , "zebra"                                
            };
        

        //generate a random number between 0 and length of the array of words and return one word as a string.
        static String randomGen(String[] a)
        {
            double rand = Math.random() * a.length;

            return a[(int)rand];
            
        }

        //this method saves the random word in a permanent variable 
        static void getWord()
        {
            chosen = randomGen(words);
        }

        //checks if users guess is correct
        static String check(String a)
        {
            chek = false;
            if(chosen.contains(a))
            {
                chek = true;
                return "there is a " + a.toUpperCase();
            }
            miss++;

            return "\nthere is not a " + a.toUpperCase() + "\n";
        }

        //this method updates the dash map
        static String[] updateDashes(String[] a, String[] b, String c)
        {
            for(int i = 0; i < a.length; i++)
            {
                if(a[i].equals(c))
                {
                    b[i] = c;
                }
            }
            return b;
        }

        
        
        
        //saves word into a array
        static void inputwordArray()
        {
            char a = ' ';
            String b = " ";
            wordArray = new String[chosen.length()];
            for(int i =0; i < chosen.length(); i++)
            {
                a = chosen.charAt(i);
                b = a + "";
                wordArray[i] = b;
            }
        }

        //creates variable to store wrong guess
        static String save(String a)
        {
            if (wrong.contains(a))
            {
                return "{ " + wrong + " }";
            }
            wrong += " " + a;

            return "{ " + wrong + " }";
        }

        //create the dashmap method
        static void getDash()
        {
            dashMap = new String[chosen.length()];
            for(int i = 0; i < dashMap.length; i++)
            {
                dashMap[i] = "_";
            }
        }

        //this will update the map the more wrong choices the player gets.
        static String progress(int a)
        {
            switch(a)
            {
                case 0 : return " +------+\n" +
                                " |      |\n" +
                                "        |\n" +
                                "        |\n" +
                                "        |\n" +
                                "        |\n" +
                                " ----------------\n" +
                                " ----------------\n";
                case 1 : return " +------+\n" +
                                " |      |\n" +
                                " O      |\n" +
                                "        |\n" +
                                "        |\n" +
                                "        |\n" +
                                " ----------------\n" +
                                " ----------------\n";
                case 2 : return " +------+\n" +
                                " |      |\n" +
                                " O      |\n" +
                                " |      |\n" +
                                "        |\n" +
                                "        |\n" +
                                " ----------------\n" +
                                " ----------------\n";
                case 3 : return " +------+\n" +
                                " |      |\n" +
                                " O      |\n" +
                                " |\\     |\n" +
                                "        |\n" +
                                "        |\n" +
                                " ----------------\n" +
                                " ----------------\n";
                case 4 : return" +------+\n" +
                               " |      |\n" +
                               " O      |\n" +
                               "/|\\     |\n" +
                               "        |\n" +
                               "        |\n" +
                               " ----------------\n" +
                               " ----------------\n";
                case 5 : return " +------+\n" +
                                " |      |\n" +
                                " O      |\n" +
                                "/|\\     |\n" +
                                "/       |\n" +
                                "        |\n" +
                                " ----------------\n" +
                                " ----------------\n";
                case 6 : return" +------+\n" +
                               " |      |\n" +
                               " O      |\n" +
                               "/|\\     |\n" +
                               "/ \\     |\n" +
                               "        |\n" +
                               " ----------------\n" +
                               " ----------------\n";
            }
             

            return "ds";
            
        }

        //this will print the array
        static String printArray (String[] a)
        {   
            String hold = "";
            for(int i = 0; i < a.length; i++)
            {
                hold += a[i];
            }
            return hold;

        }
        
   


}
