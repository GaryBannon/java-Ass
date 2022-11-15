import java.util.ArrayList;

/**
 * A class to describe a book 
 *
 * @author Gary Bannon
 * @version v1.0
 */
public class Book
{
    //set fields
    private static int counter;
    private int isbn, serialNumber;
    private String title, author;
    private Member memberWhoHas;
    private ArrayList<String> damages;
    private boolean isReferenceBook, isAvailable;
    private boolean hardback;

    /**
     * Constructor for objects of class Book
     */
    public Book(int isbn, String title, String author, boolean isReference, boolean hardback)
    {
        // initialise instance variables
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        memberWhoHas = null;
        damages = new ArrayList<String>();
        counter++;
        serialNumber = counter;
        this.isReferenceBook = isReference;
        if (isReferenceBook == false && memberWhoHas == null){
            isAvailable = true;
        }
        else {
            isAvailable = false;
        } 
        this.hardback = hardback;
    }

       /**
     * returns isbn of the book
     */
    public int getIsbn()
    {
        return isbn;
    }
    
        /**
     * returns serial number of the book
     */
    public int getSerialNumber()
    {
        return serialNumber;
    }
    
       /**
     * returns title of the book
     */
    public String getTitle()
    {
        return title;
    }
    
       /**
     * returns author of the book
     */
    public String getAuthor()
    {
        return author;
    }
    
      /**
     * returns the library member who has the book, error message if not rented
     */
    public Member getMemberWhoHas()
    {
        if (this.memberWhoHas == null){
            System.out.println("Book has not been rented.");
        }
        return memberWhoHas;
    }
    
      /**
     * returns a list of damage remarks of the book
     */
    public ArrayList getdamages()
    {
        return damages;
    }
    
      /**
     * returns if the book is a reference book
     */
    public boolean getisReferenceBook()
    {
        return isReferenceBook;
    }
    
      /**
     * returns if the book is available or not, the conditions for this to be 
     * true are that it needs to both not be rented and not be a reference book 
     * the if statement is in the constructor
     */
    public boolean getisAvailable()
    {
        return isAvailable;
    }
    
     /**
     * returns if the book is a hard cover book
     */
    public boolean getHardback()
    {
        return hardback;
    }
    
      /**
     * sets isbn of the book
     */
    public void setIsbn(int input)
    {
        isbn = input;
    }
    
      /**
     * sets title of the book
     */
    public void setTitle(String input)
    {
        title = input;
    }
    
      /**
     * sets author of the book
     */
    public void setauthor(String input)
    {
        author = input;
    }
    
      /**
     * sets if the book is a reference book or not 
     */
    public void setisReferenceBook(boolean input)
    {
        if (memberWhoHas != null){
            System.out.println("Make sure the book has been returned!");
        }
        else{
            isReferenceBook = input;
        }
    }
    
    public void addDamages(String input)
    {
        damages.add(input);
    }
    
      /**
     * method for borrowing of the book
     */
    public void borrowBook(Member input)
    {
        memberWhoHas = input;
    }

    /**
     * method for returning of the book
     */
    public void returnBook(Member input)
    {
        if (memberWhoHas == input){
            memberWhoHas = null;
        }
        
        else {
            System.out.println("This member does not have this book");
        }
    }    
    
    /**
     * prints the details of the book
     */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN Number: " + isbn);
        System.out.println("Serial Number: " + serialNumber);
         if (damages.size() == 0){
            System.out.println("Book has no damage.");
        }
        else {
            System.out.println("List of Damage: ");
            for (String damage : damages){
            System.out.println(damage);
            }
        }
        if (isReferenceBook == true){
            System.out.println("This is a reference book.");
        }
        else if (memberWhoHas == null){
            System.out.println("Book is available.");
        }
        else if (memberWhoHas != null){
            System.out.println("Member who currently has this book: " + memberWhoHas.getName());
        }
        
    }
    
    }


