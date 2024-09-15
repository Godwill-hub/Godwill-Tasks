package Assignment3;
import java.util.ArrayList;
import java.util.List;

public class Library{
    private List<Book> books;
    private List<Member> members;

    public Library(){// Here we are initializing books and members lists
        this.books=new ArrayList<>();
        this.members=new ArrayList<>();
    }
    public void addBook(Book book){// This here is a method to add a book to the library
        books.add(book);
        System.out.println("Book added to the library:"+book.title);
    }
    public void registerMember(Member member){//This method helps us to register a new member
        members.add(member);
        System.out.println("Member registered:"+member.name);
    }
    public void lendBook(String isbn,String memberId){//This method helps us lend a book to a member
        Book book=findBookByIsbn(isbn);//this method will help us allow the user to give us the isbn
        Member member=findMemberById(memberId);//this method will help us allow the user to provide his/her memberId

        if (book!=null&&member!=null){//this statement will help us check if the book and member exist.
            if (book.getCopiesAvailable()>0){//this statement checks if the book is available
                member.borrowBook(book);//action is taken-and the member borrows the book
                book.setCopiesAvailable(book.getCopiesAvailable()-1);//this command now decreases the number of Available because a book has just been borrowed
                System.out.println("Book:"+book.title+"has been lent to:"+member.name);//this statement is just a feedback message to let the user know that a book has been lent to a certain member
            }
            else{
                System.out.println("Book is not available.");//if no copies of the given book are available then this message "Book is not available" will be printed
            }
        }
        else{
            System.out.println("Book nor member found.");//if both the book and member are not found then this message "Book nor member found"
        }
    }
    private Book findBookByIsbn(String isbn){// This is a private method that helps us find a book by its ISBN
        for(Book book:books){//This code will tell the computer to keep on checking every book
            if(book.getIsbn().equals(isbn)){//If the book it has reached on matches the isbn you provided then it will return or show the book that it is found.
                return book;
            }
        }
        System.out.println("Book was not found with ISBN:"+isbn);//if the isbn you provided doesn't match any book then the computer will tell you "Book was not found with that particular number".
        return null;
    }
    private Member findMemberById(String memberId){// This is a private helper method to find a member by their ID
        for(Member member:members){//This code will tell the computer to keep on checking every member
            if(member.getMemberId().equals(memberId)){//If the memberId it has reached on matches the memberId you provided then it will return or show the book that it is found.
                return member;
            }
        }
        System.out.println("Member not found with ID:"+memberId);//Here you're just telling the computer that if the MemberId the user provided doesn't match any book then the computer will write back a message to the user that "Book was not found with that particular number".
        return null;
    }
}

