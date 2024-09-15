package Assignment3;
import java.util.ArrayList;
import java.util.List;
public class Member {
    public String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name,String memberId){//Here we initialize the name and memberId and we also create and array list for borrowed books
        this.name=name;
        this.memberId=memberId;
        this.borrowedBooks=new ArrayList<>();
    }
    public String getMemberId(){//This method helps us to access the memberId attribute
        return memberId;
    }
    public void borrowBook(Book book){//Here we are told in the question that the borrowBook method will use the addBookToBorrowedList method to add a book to the members borrowed books list thtas why we have included addBookToBorrowedList method to the borrowBook method.
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
