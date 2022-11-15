import java.util.ArrayList;
/**
 * Write a description of class eBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class eResource extends Resource
{
    private int maxUsers;
    private int noOfCurrentUsers;
    private ArrayList<People> currentUsers;
    
    /**
     * Constructor for objects of class eBook
     */
    public eResource(String author, String title, String date, boolean downloadable, String url, int maxUsers)
    {
        super(author, title, date, downloadable, url);    
        this.maxUsers = maxUsers;
        currentUsers = new ArrayList<People>();
        noOfCurrentUsers = currentUsers.size();
    }
    
    public int getMaxUsers()
    {
        return maxUsers;
    }
    
    public int getnoOfCurrentUsers()
    {
        return noOfCurrentUsers;
    }
    
    public ArrayList getCurrentUsers()
    {
        return currentUsers;
    }
    
    public void setMaxUsers(int input)
    {
        maxUsers = input;
    }
    
    public void printDetails(){
        System.out.println("Type: eBook");
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Title: " + this.getTitle());
        System.out.println("Date Published: " + this.getDate());
        System.out.println("Downloadable?" + this.isDownloadable());
        System.out.println("URL: " + this.getUrl());
        System.out.println("Maximum concurrent users: " + maxUsers);
        System.out.println("Current Users: " + currentUsers);
    }
    
}
