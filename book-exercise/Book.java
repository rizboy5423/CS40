/**
 * William Kong
 */
public class Book
{

    String author; 
    String title;
    String refNumber;
    private int pages;
    private int borrowed;

    public Book(String bookAuthor, String bookTitle, int p)
    {
        author = bookAuthor; 
        title = bookTitle; 
        pages = p;
        refNumber = "";
    }

    public String getAuthor()
    {
        return author;
    }

    public String getbookTitle()
    {
        return title;
    }

    public int getPages()
    {
        return pages;
    }

    public void printAuthor()
    {
        System.out.println(author);
    }

    public void printTitle()
    {
        System.out.println(title);
    }

    public void printDetails()
    {
        int length = refNumber.length();

        System.out.print("Title: " + title);
        System.out.print(" Author:" + author);
        System.out.print(" Pages:" + pages);
        System.out.print(" Books Borrowed: " + borrowed);//number of books borrowed.
        if(length>=1)
        {
            System.out.print(" RefNumber:" + refNumber);
        
        }
        else
        {
            System.out.print(" ZZZ ");
        }

    }

    public void setRefNumber(String ref)
    {
        int l = ref.length();
        
        if(l>=3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("error!");
        }
    }

    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void borrow()
    {
        borrowed += 1;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
}