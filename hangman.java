package games.HangMan;
import java.util.Scanner;

public class hangman {
            static char holder = ' ';
            static int length = 0;
            static String[] words = {
                                        "Aardvark", "Alligator"+"Alpaca","Anaconda","Ant","Anteater","Antelope"
                                        , "Aphid","Armadillo","Asp","Ass","Baboon","Badger","Bald Eagle","Barracuda"
                                        ,"Bass","Basset Hound","Bat" ,"Bearded Dragon", "Beaver" ,"Bedbug","Bee",
                                         "Bee-eater" ,"Bird" ,"Bison" ,"Black panther","Black Widow Spider"
                                         ,"Blue Jay" ,"Blue Whale", "Bobcat" ,"Buffalo" ,"Butterfly"
                                         , "Buzzard" , "Camel" , "Canada Lynx" , "Carp", "Cat"  ,"Caterpillar" , "Catfish" , "Cheetah" , "Chicken"
                                         , "Chimpanzee", "Chipmunk" , "Cobra" , "Cod" ,"Condor" , "Couga" , "Cow" , "Coyote" , "Crab" ,
                                         "Crane Fly" , "Cricket" , "Crocodile"  , "Crow"  , "Cuckoo" , "Deer"  ,"Dinosaur"  ,"Dog"  ,"Dolphin" ,"Donkey"
                                         ,"Dove"     ,"Dragonfly" ,"Duck" ,"Eagle"  ,"Eel"  ,"Elephant"  , "Emu"  , "Falcon"
                                        , "Ferret", "Finch" , "Fish" , "Flamingo" , "Flea", "Fly"  , "Fox" , "Frog"  , "Goat"
                                         , "Goose"   , "Gopher"   , "Gorilla" , "Guinea Pig"    , "Hamster"   , "Hare" , "Hawk"
                                         ,"Hippopotamus","Horse","Hummingbird" ,"Humpback Whale","Husky","Iguana","Impala", "Kangaroo" ,"Lemur"
                                        , "Leopard", "Lion" ,"Lizard","Llama" ,"Lobster" ,"Margay","Monitor lizard","Monkey", "Moose", "Mosquito", "Moth"
                                        , "Mountain Zebra" , "Mouse", "Mule" , "Octopus" , "Orca" , "Ostrich" , "Otter" , "Owl"  , "Oyster" , "Panda"
                                       , "Parrot"  , "Peacock" , "Pelican" , "Penguin" , "Perch",  "Pheasant", "Pig", "Pigeon", "Polar bear" ,"Porcupine"
                                        , "Quagga" ,"Rabbit" , "Raccoon" , "Rat", "Rattlesnake"  ,"Red Wolf" , "Rooster" , "Seal" , "Sheep"  ,"Skunk"
                                        , "Sloth", "Snake", "Spider" , "Tiger", "Whale" , "Wolf", "Wombat" , "Zebra"                                
                            };
            static String hidden;
            static String dash;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        boolean solved = false;
        //int missed = 0;
        hidden = word(words);
        char guess = ' ';
        //int num = 0;
        
        System.out.println("Welcome to hangman");
        System.out.println("+------+\n" +
                           "|      |\n" +
                           "       |\n" +
                           "       |\n" +
                           "       |\n" +
                           "       |\n" +
                           "----------------\n" +
                           "----------------\n" );
        //System.out.println(dashes(hidden.length()));
        System.out.println(hidden);
        System.out.println(dashes(hidden.length()));
        while(solved == false)
        {
           
            System.out.println("guess a letter");
            guess = scan.next().charAt(0);
            System.out.println(check(guess, hidden.toLowerCase()));
            System.out.println(updated());

        }
        scan.close();

    }
    static String check(char in, String word)
    {
        
        char a = ' ';
        
        for(int i = 0; i < word.length(); i++)
        {
            a = word.charAt(i);
            if(a == in)
            {
                hold(a);
                return "there is a " + in;
            }
            else if (i == word.length() -1 && (a != in)){
                return "there's no " + in;
            }
        }
        return "kd";
    }
    static String dashes(int a)
    {
        String word = "";
        for(int i = 0; i < a; i++)
        {
            word += "-";
        }
        return word;
    }
    static String word(String[] word)
    {
        double ran = Math.random() * word.length -1;
        return word[(int)ran];
    }
    /*static String check(String a, String b)
    {
        return "jd";
    }*/
    static void hold(char a)
    {
        holder = a;
        
    }

    static String updated()
    {
        char c = 'a';
        String dash = "";
        for(int i = 0; i < hidden.length();i++)
        {
            c = hidden.charAt(i);
            if(c == holder)
            {
                for(int j = 0; j < hidden.length(); i++)
                {
                    
                    if(j == i)
                    {
                        dash += holder;
                    }
                    else{
                        dash += "-";
                    }
                }
            }
        }
        return hidden;
    }
    
}
