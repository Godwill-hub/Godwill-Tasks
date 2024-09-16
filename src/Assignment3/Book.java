package Assignment3;

public class Book{
    public String title;
    public String author;
    private String isbn;
    int copiesAvailable;

    public Book(String title,String author,String isbn,int copiesAvailable){ 
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.copiesAvailable=copiesAvailable;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setCopiesAvailable(int numofcopiesavail){
        this.copiesAvailable=numofcopiesavail;
    }
    int getCopiesAvailable(){
        return copiesAvailable;
    }
}
