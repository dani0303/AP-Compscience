
/**
 * Write a description of class Question7 here.
 *
 * @author (Daniel Rodriguez)
 * @version (Question 7 10/25/21)
 */
public class Book
{
    private int numPages, currentPage;
    /*
     * lines 14-28 are accessors
     */
    public Book(int np)
    {
        numPages = np;
        currentPage = 1;
    }
    
    public int getNumPages()
    {
        return numPages;
    }
    
    public int getCurrentPage()
    {
        return currentPage;
    }
    
    public void nextPage()
    {
        if(currentPage < numPages)
            currentPage++;
        else
            System.out.println("wrong");
    }
}
