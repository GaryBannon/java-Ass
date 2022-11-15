import java.util.ArrayList;

/**
 * Superclass to describe people in the library
 *
 * @author Gary Bannon
 * @version 2022
 */
public class People
{
    // instance variables - replace the example below with your own
    private String title;
    private String name;
    private String dob;
    private String gender;
    private ArrayList<String> messages;
    
    /**
     * Constructor for objects of class People
     */
    public People(String title, String name, String dob, String gender)
    {
        this.title = title;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        messages = new ArrayList<String>();
    }
    
    public String getTitle()
    {
        return title;
    }

    public String getName()
    {
        return name;
    }
    
    public String getDob()
    {
        return dob;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public ArrayList getMessages()
    {
        return messages;
    }
    
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    
    public void setName(String newName)
    {
        this.title = newName;
    }
    
    public void setDob(String newDob)
    {
        this.title = newDob;
    }
    
    public void setGender(String newGender)
    {
        this.title = newGender;
    }
    
    public void addMessage(String message)
    {
        messages.add(message);
    }
    
    public void clearMessages()
    {
        messages.clear();
    }
    
    
}
