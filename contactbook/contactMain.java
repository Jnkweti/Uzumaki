package contactbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;


public class contactMain {

    static  contactManager manager = new contactManager();
    public static void main(String[] args) {
       
       try {
        loadContacts("conts.txt");
        System.out.println("CONTACTS LOADED \n\n");
        System.out.println(manager);
        } catch (FileNotFoundException e) {
            
            System.out.println(e.getMessage());
        }
        manageContacts();
      

       


    }
    public static void loadContacts(String fileName) throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()){
            try {
                contacts cont = new contacts(scanFile.next(), scanFile.next(), scanFile.next());
                manager.addContact(cont);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }

        }
        scanFile.close();
    }
    
    public static void manageContacts()
    {
        Scanner scan = new Scanner(System.in);
        //this while loop allows the user to add and remove contacts from the contact list.
        while(true)
        {
            //loop will run until user exits.
            System.out.println("would you like to \n\ta) add another contact\n\tb) remove a contact \n\tc) exit" );
            String input = scan.nextLine();

            //adding a contact
            if(input.equals("a"))
            {
                System.out.println("\tname:");
                String name = scan.nextLine();
                if(name == null || name.isBlank())
                {
                    System.out.println("invalid iput!!");
                    continue;
                }
                
                System.out.println("\tBirth Date:");
                String bday = scan.nextLine();

                System.out.println("\tPhone Number:");
                String num= scan.nextLine();
                if(bday == null || bday.isBlank())
                {
                    System.out.println("invalid iput!!");
                    continue;
                }
                

                try {
                    manager.addContact(new contacts(name,bday, num));
                } catch (ParseException e) {
                    
                    System.out.println(e.getMessage());
                }
                finally{
                    System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);
                }
            }

            //removing a contact
            else if(input.equals("b"))
            {
                System.out.println("\tname: ");
                String name = scan.nextLine();
                
                manager.removeContact(name);
                
                System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);
                
            }
            //exit program
            else if (input.equals("c"))
            {
                System.out.println(manager + "\nContact Book closed.  :)");
               break;
            }
            //catches any other user input
            else{
                System.out.println("Invalid input. Goodbye");
                break;
            }
        }

        scan.close(); 
    }
}
