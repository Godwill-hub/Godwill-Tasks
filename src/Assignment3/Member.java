package Assignment3;
import java.util.ArrayList;
import java.util.List;
public class Member {
    public String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name,String memberId){
        this.name=name;
        this.memberId=memberId;
        this.borrowedBooks=new ArrayList<>();
    }
    public String getMemberId(){
        return memberId;
    }
    public void borrowBook(Book book){
        addBookToBorrowedList(book);
    }
    private void addBookToBorrowedList(Book book){
        if (book.getCopiesAvailable()>0){
            borrowedBooks.add(book);
            System.out.println(name+"borrowed the book:"+book.title);
        }
        else {
            System.out.println("The book is not present for borrowing.");
        }
    }
}
