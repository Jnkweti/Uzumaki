import java.util.Scanner;

public class gpaCalculator {
    // to take user input as values
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // variables to store user input
        int numberOfClasses = 0;

        // stores invalid user input
        int num = 0;

        String educationLevel = null;

        // stores invalid user input
        String ed = null;

        // final GPA
        double score = 0;

        // get user input

        // get level of education
        System.out.println("Highschool or College?");
        ed = scan.nextLine();
        /*
         * to catch any invalid inputs, this method because there are only two
         * acceptable inputs
         * this loop will run until a valid input is entered
         */
        while (!ed.equalsIgnoreCase("highschool") && !ed.equalsIgnoreCase("college")) {

            System.out.println("invalid input please try again:");
            ed = scan.nextLine();
        }
        educationLevel = ed;
        // try catch method was user here because the number of acceptable inputs is too
        // big
        try {
            // get number of classes
            System.out.println("How many " + educationLevel + " classes have you taken so far?");
            num = scan.nextInt();
            // this loop will run until a valid input is entered
            while (num < 0) {
                System.out.println("invalid input please try again:");
                num = scan.nextInt();
            }
            if (num == 0) {
                System.out.println("I don't know why your even here. :|");
            } else {
                // once valid input is entered it is stored below
                numberOfClasses = num;
                // function calculate gpa
                score = addUp(numberOfClasses);
                // function tells user if their gpa is good or not
                check(score);
            }

        }
        // catch any invalid input not covered above
        catch (Exception e) {
            System.err.println("wrooooong, invalid input");
        }

        scan.close();
    }

    public static double addUp(int num) {
        //values used to calculate gpa
        double gpa = 0;
        int total = 0;
        //loop the prompt user for the grades of all the classes they said they had done
        System.out.println("enter your grades one at a time:");
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + ": ");
            total += scan.nextInt();
        }
        //divides total by number of classes
        gpa = total / num;
        //divides that result by 25
        gpa /= 25;

        return gpa;
    }
    //prints results
    public static void check(double num) {
        if (num >= 3.70) {
            System.out.println("you have an excellent GPA: " + num);
        } else if (num >= 3.30 && num <= 3.69) {
            System.out.println("you have a good GPA: " + num);
        } else if (num >= 2.90 && num <= 3.29) {
            System.out.println("you have an average GPA: " + num);
        } else if (num <= 2.89) {
            System.out.println("you have a bad GPA: " + num);
        }

    }

}
