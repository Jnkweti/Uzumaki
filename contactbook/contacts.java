package contactbook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.concurrent.TimeUnit;

public class contacts {
    private String name;
    private int age;
    private String bDay;
    private String number;

    
    
    public contacts(String name, String bDay, String number) throws ParseException
    {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("name cannot be null or blank");
        }
        if(number == null || number.isBlank())
        {
            throw new IllegalArgumentException("number cannot be null or blank");
        }
        if(number.length() != 10)
        {
            throw new IllegalArgumentException("Invalid phone number " + number);
        }
        
        this.name = name;
        this.bDay = number;
        this.number = bDay;
        this.age = toAge(bDay);
        
        
    }
    public contacts(contacts source) 
    {
        this.name = source.name;
        this.bDay = source.bDay;
        this.number = source.number;
        this.age = source.age;
        
        
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name) {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("invalid input");
        }
        this.name = name;
    }
    
    public int getAge()
    {
        return this.age;
    }
    private void setAge(int age) {
        
        this.age = age;
    }
    public int toAge(String bDay) throws ParseException
    {
        SimpleDateFormat form = new SimpleDateFormat("mm/dd/yyyy");
        form.setLenient(false);
        long diff = new Date().getTime() -  form.parse(bDay).getTime();
        return this.age =(int)TimeUnit.MILLISECONDS.toDays(diff) / 365;
    }

    public String getbDAy()
    {
        return this.bDay;
    }
    public void setbDay(String bDay) throws ParseException {
        this.bDay = bDay;
        setAge(toAge(bDay));
    }

    public String getNumber()
    {
        return this.number;
    }
    public void setNumber(String number) {
        if(number == null || number.isBlank() || number.length() != 10)
        {
            throw new IllegalArgumentException("Invalid Input(phonenumber)");
        }
        this.number = number;
    }
    


    public String toString()
    {
        return "Name: " + getName() + "\n" +
        "Phone number: " + getNumber() + "\n" +
        "Birth Date: " + getbDAy() + "\n" +
        "age: " + getAge() + " years old";
    }
    
}
