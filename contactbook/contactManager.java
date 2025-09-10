package contactbook;

import java.util.ArrayList;

public class contactManager {

    ArrayList<contacts> Manager;
    public  contactManager()
    {
        this.Manager = new ArrayList<contacts>();
    }

    public contacts getManager(int index) {
        return new contacts(Manager.get(index));
    }

    public void setContacts(contacts Contact, int index)
    {
        Manager.set(index, new contacts(Contact));
    }

    public void addContact(contacts contact)
    {
        Manager.add(new contacts(contact));
    }

    public void removeContact(String name)
    {
        for (int index = 0; index < Manager.size(); index++) 
        {
            if(Manager.get(index).getName().equals(name))
            {
                Manager.remove(index);
            }
        }

    }

    @Override
    public String toString() {
        
        String temp = " ";
        for (int i = 0; i < Manager.size(); i++) 
        {
            temp += Manager.get(i).toString();
            temp += "\n\n";

        }
        return temp;
    }
}
