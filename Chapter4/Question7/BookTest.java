
/**
 * Write a description of class BookTest here.
 *
 * @author (Daniel Rodriguez)
 * @version (Question 7 BookTest 10/25/21)
 */
public class BookTest
{
    public static void main(String[] args)
    {
        Book b1 = new Book(1);
        b1.nextPage();
        System.out.println("Current page is " + b1.getCurrentPage());
    }
}
