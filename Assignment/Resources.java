import java.util.ArrayList;

/**
 * A class to describe online resources
 *
 * @author Gary Bannon 
 * @version 2022
 */
public class Resources
{
    // instance variables - replace the example below with your own
    private String author, title, date;

    /**
     * Constructor for objects of class eResource
     */
    public Resources(String author, String name, String pubDate, boolean download, String site)
    {
        // initialise instance variables
        this.author = author;
        title = name;
        date = pubDate;
        downloadable = download;
        url = site;
    }

    // getters and setters
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String getUrl()
    {
        return url;
    }
    
    public boolean isDownloadable()
    {
        return downloadable;
    }
    
    public void setAuthor(String input)
    {
        author = input;
    }
    
    public void setTitle(String input)
    {
        title = input;
    }
    
    public void setDate(String input)
    {
        date = input;
    }
    
    public void setUrl(String input)
    {
        url = input;
    }
    
    public void setDownloadable(boolean input)
    {
        downloadable = input;
    }
    
}
