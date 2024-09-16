package Assignment3;
import java.util.ArrayList;
import java.util.List;

public class Library{
    private List<Book> books;
    private List<Member> members;
    public Library(){
        this.books=new ArrayList<>();
        this.members=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to the library:"+book.title);
    }
    public void registerMember(Member member){
        members.add(member);
        System.out.println("Member registered:"+member.name);
    }
    public void lendBook(String isbn,String memberId){
        Book book=findBookByIsbn(isbn);
        Member member=findMemberById(memberId);
        if (book!=null&&member!=null){
            if (book.getCopiesAvailable()>0){
            member.borrowBook(book);
            book.setCopiesAvailable(book.getCopiesAvailable()-1);
            System.out.println("Book:"+book.title+"has been lent to:"+member.name);
            }
            else{
                System.out.println("Book is not available.");
        }
        else{
            System.out.println("Book nor member found.");
        }
    }
    private Book findBookByIsbn(String isbn){
        for(Book book:books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        System.out.println("Book was not found with ISBN:"+isbn);
        return null;
    }
    private Member findMemberById(String memberId){
        for(Member member:members){
            if(member.getMemberId().equals(memberId)){
                return member;
            }
        }
        System.out.println("Member not found with ID:"+memberId);
        return null;
    }
}

