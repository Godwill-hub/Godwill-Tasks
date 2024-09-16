package Assignment3;

public class Book{
    public String title;
    public String author;
    private String isbn;
    int copiesAvailable;

    public Book(String title,String author,String isbn,int copiesAvailable){ //Here is a Constructor and it initializes the attributes we have declared above.
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.copiesAvailable=copiesAvailable;
    }
    public String getIsbn(){// This method gets the isbn of the book
        return isbn;
    }
    public void setCopiesAvailable(int numofcopiesavail){// This method sets the number of copies available for that particular book.
        this.copiesAvailable=numofcopiesavail;
    }
    int getCopiesAvailable(){//This method gets the number of copies available for a particular book.
        return copiesAvailable;
    }
}
