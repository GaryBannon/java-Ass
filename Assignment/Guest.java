
/**
 * A class to describe a guest at the library
 *
 * @author Gary
 * @version 2022
 */
public class Guest extends People
{
    // instance variables - replace the example below with your own
    private int daysAccess;
    /**
     * Constructor for objects of class Guest
     */
    public Guest(String title, String name, String dob, String gender, int daysAccess)
    {
        super(title, name, dob, gender);
        this.daysAccess = daysAccess;
    }
    
    public int getDaysAccess()
    {
        return daysAccess;
    }
    
    public void extendAccess(int extension)
    {
        this.daysAccess += extension;
    }
    
}
