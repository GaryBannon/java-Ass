import java.util.ArrayList;
/**
 * a class to describe members of the library
 *
 * @author Gary Bannon
 * @version 2022
 */
public class Member extends People
{
    // instance variables - replace the example below with your own
    private static int counter;
    private ArrayList<Book> booksBorrowed;
    private int cardNumber;
    /**
     * Constructor for objects of class Member
     */
    public Member(String title, String name, String dob, String gender)
    {
        super(title, name, dob, gender);
        booksBorrowed = new ArrayList<Book>();
        counter++;
        this.cardNumber = counter;
    }
    
    public ArrayList getBooksBorrowed()
    {
        return booksBorrowed;
    }
    
    public int getCardNumber()
    {
        return cardNumber;
    }

}
