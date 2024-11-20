
/**
 * Write a description of class MusicFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicFile
{
    // instance variables - replace the example below with your own
    private String filename;
    private String style;
    private String singer;
    private String publisher;
    private int year;

    /**
     * Constructor for objects of class MusicFile
     */
    public MusicFile(String filename, String style, String singer, String publisher, int year)
    {
        this.filename = filename;
        this.singer = singer;
        this.publisher = publisher;
        this.year = year; 
        this.style = style;
    }
    public void printInfo()
    {
      System.out.println("The File Name" + filename);  
      System.out.println("The singer" + singer); 
      System.out.println("The Publisher" + publisher); 
      System.out.println("The Year" + year); 
      System.out.println("The Style" + style); 
    }
    public String getFileName()
    {
        return filename;
    }
}
